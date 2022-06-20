
public class SecondSmallest {

	public static void main(String[] args) {
		int arr[] = { 6, 7, 2, 3, 4, 5 };

		System.out.println(getSecondSmallest(arr, arr.length));
	}

	static int getSecondSmallest(int[] arr, int n) {

		int smallest = Integer.MAX_VALUE;

		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {

			if (arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			} 

			if (arr[i] != smallest && arr[i] < secondSmallest) {
				secondSmallest = arr[i];
			}

		}

		return secondSmallest;

	}

}
