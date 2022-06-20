
public class SecondLargest {

	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5,6,7};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int a:arr) {
			
			if(a>=first) {
				second=first;
				first=a;
			}else if(a>second) {
				second =a;
			}
		}
		
		System.out.println("First "+first+ "second "+second);
		
	}
}
