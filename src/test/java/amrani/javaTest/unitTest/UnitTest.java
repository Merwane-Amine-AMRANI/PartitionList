package amrani.javaTest.unitTest;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import amrani.javaTest.PartitionList;

public class UnitTest {

	static List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
	static List<Integer> emptyList = Arrays.asList();

	@Test
	public void should_return_a_list_of_4_list_with_length_2_each() {

		List<List<Integer>> result = PartitionList.partition(numberList, 2);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6),
				Arrays.asList(7));
		assertEquals(expected, result);
	}

	@Test
	public void should_throw_exception_when_size_is_0() {
		try {
			PartitionList.partition(numberList, 0);
		} catch (IllegalArgumentException e) {
			assertEquals("La valuer de taille doit être supérieur à 0", e.getMessage());
		}
	}

	@Test
	public void should_throw_exception_when_list_is_empty() {
		try {
			PartitionList.partition(emptyList, 2);
		} catch (IllegalArgumentException e) {
			assertEquals("initialList ne peut pas être vide", e.getMessage());
		}
	}

	@Test
	public void should_throw_exception_when_list_is_empty_and_taille_is_0() {
		try {
			PartitionList.partition(emptyList, 0);
		} catch (IllegalArgumentException e) {
			assertEquals("initialList ne peut pas être vide et La valuer de taille doit être supérieur à 0",
					e.getMessage());
		}
	}

}
