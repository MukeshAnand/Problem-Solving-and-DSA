
public class Test {
	
	public static void main(String[] args) {
	
		//int arr[] = {2,1, 5, 7, 9,10};
		
		//int arr[] = {4,5,8,6,7,9};
		
		int arr[] = {4,5,6,7,7,8};

		
	   System.out.println(getSecondMax(arr, arr.length));	
	}
	
	
	public static int getSecondMax(int[] arr,int n) {
		
		int max = 0;
		
		int firstMax = arr[0],temp = arr[0];
		
		int secondMax = 0;
		
		int countSecondMax = 0;
		
		boolean isChanged = false;
	
		// 4 5 6 7 7 8 
		
	
		for(int i=1;i<n;i++) {
			

			temp = firstMax;  // 5
			
			
			if(firstMax <= arr[i]) { 
				firstMax = arr[i];   //6
			}else if(secondMax<= arr[i]){
				
				secondMax = arr[i]; 
				isChanged = true;
				
			}
	
        	if(temp!=firstMax) {  
        		secondMax = temp;  //5
        		isChanged = true;
        	
        	}
        	
        	
        	
        	if(isChanged) {
        		countSecondMax=1;
        	}
        	
        	
        	if(secondMax ==arr[i]) {
        		countSecondMax++;
        	}
 
		}
		
		
		
		
		
		System.out.println("Second Max Count : "+countSecondMax);
		
		
		
		return secondMax;
	}
	

}


