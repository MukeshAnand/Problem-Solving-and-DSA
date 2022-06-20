package arraysTest;

public class WindowSlidingTech {
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,1,7,9,3,8,10};
		
		int k =3;
		
		getMaxSubK(arr, arr.length,k);
		getMaxSubEfficient(arr, arr.length,k);
		
	}

	private static int getMaxSubK(int[] arr, int n,int k) {
		
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		for(int i=0;i+k-1<n;i++) {
			currSum =0;
			
			for(int j=0;j<k;j++) {
				//currSum  =Math.max(currSum, arr[i+j]);
				currSum += arr[i+j];
				
			}
			maxSum = Math.max(currSum,maxSum);
			System.out.println("Max Subarray Starts with "+arr[i]+" ends with "+arr[(i+k-1)] +" "+maxSum);
		}
		
		return maxSum;
		
	}
	
	private static int getMaxSubEfficient(int[] arr,int n,int k) {
		
		int currSum = 0;

		for(int i=0;i<k;i++) {
			
			currSum += arr[i];
		}
		int maxSum = currSum;
		
		for(int i=k;i<n;i++) {
			currSum+=(arr[i]-arr[i-k]);
			maxSum = Math.max(currSum, maxSum);
		}
		System.out.println("Max Subarray Sum "+maxSum);
		return maxSum;
		
	}

}
