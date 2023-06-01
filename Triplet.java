package Assignment2;

public class Triplet {
	public int maximumProduct(int[] arr) {
		int n = arr.length;
		if (n < 3)
			return -1;

		int max_product = Integer.MIN_VALUE;

		for (int i = 0; i < n - 2; i++)
			for (int j = i + 1; j < n - 1; j++)
				for (int k = j + 1; k < n; k++)
					max_product = Math.max(max_product, arr[i] * arr[j] * arr[k]);

		return max_product;
	}
}
