package Assignment2;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
	public int distributeCandies(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i : arr)
			set.add(i);
		int total = set.size();
		int length = arr.length / 2;
		if (total <= arr.length / 2)
			return total;
		else
			return length;
	}
}
