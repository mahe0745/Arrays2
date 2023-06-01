package Assignment2;

import java.util.Arrays;

public class SmallestRange {
	public int smallestRangeI(int[] arr, int k) {
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length - 1];
		if ((min + k) >= max - k)
			return 0;
		else
			return (max - k) - (min + k);
	}
}
