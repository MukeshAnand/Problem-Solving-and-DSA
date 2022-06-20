
public class PeakElement {

	public static void main(String[] args) {
		
		//int arr[] = {39, 33, 8, 9, 7, 19,21};
		
		//int arr[]= {5, 10, 20, 15};
		
		int arr[]={10, 20, 15, 2, 23, 90, 67};
		
		System.out.println(peekElement(arr,0,arr.length));
		
		
	}
	
	
	
	static int peekElement(int []arr, int low, int high) {
		
		int mid=low+high / 2;
		
		if((mid == 0 ||arr[mid-1]<= arr[mid]) && (mid == arr.length - 1|| arr[mid+1]<=arr[mid])) {
			return arr[mid];
		}else if(mid>0 && arr[mid+1]>arr[mid]) {
			 return peekElement(arr,low,mid-1);
		}else {
			return peekElement(arr,mid+1,high);
		}	
	}
}
