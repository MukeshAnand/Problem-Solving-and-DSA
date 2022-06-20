package arraysTest;

public class LCM {

	public static void main(String[] args) {
		
		System.out.println("LCM "+getLCM(72 ,120));
		
	}
	
	private static int getLCM(int n1, int n2) {
		
		int gcd=1;
		
		for(int i=1;i<=n1 && i<=n2 ;i++)
		{
			if(n1%i== 0 && n2%i==0) {
				gcd=i;
			}
		}
		System.out.println("gcd/HCF " +gcd);
		int lcm = (n1 *n2)/gcd;
		return lcm ;
	}
}
