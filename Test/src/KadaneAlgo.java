import java.util.Scanner;

public class KadaneAlgo {
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		long before = System.currentTimeMillis();
		
		int testCase = scr.nextInt();
		
		while(testCase!=0) {
			
			int n = scr.nextInt();
			
			int[] arr = new int[n];
			
			scr.nextLine();     
	        String[] str = scr.nextLine().split(" ");
			
		
			  for(int i =0;i<n;i++) {
			 
			  arr[i]=Integer.parseInt(str[i]);
			  
			  }
			 
			
			int sum = arr[0],temp=arr[0];
			
			for(int i=1;i<n;i++) {
				temp = temp +arr[i];
				if(temp<arr[i])
					temp =arr[i];
				if(sum <temp)
					sum = temp;
				
				//temp = Math.max(temp+arr[i],arr[i]);
				//sum=Math.max(sum,temp);
			}
             
			
			System.out.println(sum);
			testCase--;
			
		}
		long now = System.currentTimeMillis();

	     System.out.println("Seconds elapsed: " + (now-before)/1000F + " seconds." );
	}
	
}
