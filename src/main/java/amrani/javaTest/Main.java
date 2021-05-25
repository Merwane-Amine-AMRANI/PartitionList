package amrani.javaTest;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		int size = 2;
		List<List<Integer>> result = PartitionList.partition(list, size);
		System.out.println("Result:  " + result);

	}

}
