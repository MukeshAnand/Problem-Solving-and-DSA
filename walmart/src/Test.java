import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		
		int arr[] = {3,4,-1,1};
		
		Arrays.sort(arr);
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=0) {
				count++;
			}
		}
		
		int arr2[] = Arrays.copyOfRange(arr, count, arr.length); /// {1, 4 }; //100,102,300
		
		int n= arr2.length;
		

		
		for(int i=1;i<n;i++) {
			
			if(arr[i-1]==i) {  
				System.out.println(i);
				break;
			}
		}
	

	}

}


