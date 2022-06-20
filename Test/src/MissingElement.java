import java.util.Scanner;

public class MissingElement {
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		 int testCase = scr.nextInt();
		 
		 while(testCase -->0) {
			 
			 int n = scr.nextInt();
			 scr.nextLine();
			 String[] str = scr.nextLine().split(" ");
			 
			 int[] arr = new int[n];
			 
			 int arraySum = 0;
			 
			 for(int i=0;i<n-1;i++) {
				 
				 arr[i] = Integer.parseInt(str[i]);
				 arraySum+=arr[i];
				 
			 }
			 
			 int tempSum= 0;
			 
			 for(int i=1;i<=n;i++) {
				 tempSum +=i;
				  
			 }
			 
			 int res =tempSum-arraySum;
			 System.out.println(res);
		 }
		
		
	}

}
