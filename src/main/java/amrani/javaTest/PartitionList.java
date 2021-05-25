package amrani.javaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class PartitionList<T> {

	public static <T> List<List<T>> partition(List<T> list, int size) {

		final AtomicInteger count = new AtomicInteger();

		if ((list == null || list.isEmpty()) && size <= 0)
			throw new IllegalArgumentException(
					"initialList ne peut pas être vide et La valuer de taille doit être supérieur à 0");
		if (size <= 0)
			throw new IllegalArgumentException("La valuer de taille doit être supérieur à 0");
		if (list == null || list.isEmpty())
			throw new IllegalArgumentException("initialList ne peut pas être vide");

		if (size >= list.size()) {
			List<List<T>> result1 = Arrays.asList(list);
			return result1;
		}
		return new ArrayList<>(
				list
				.stream()
				.collect(Collectors.groupingBy(it -> count.getAndIncrement() / size))
				.values());
	}

}
