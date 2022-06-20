
public class TestPalindrome {

	
	public static void main(String[] args) {
		
		
		String str = "car";   //racecar
		
		System.out.println("Test");
		
		if(isPalindrome(str)) {
			System.out.println(0);
			return;
		}
		
		System.out.println("Test");
		
		String  palindrome=str;
		
		int j=0;
		
		int count=0;
		
		while(j<str.length()) {
			
			
			
			System.out.println(isPalindrome(palindrome)+" "+palindrome);
			
			if(isPalindrome(palindrome)) {
				System.out.println(count+1);
				return;
			}
			
			palindrome=palindrome.substring(1);
			
			count++;
			j++;
			
		}
		
		
	}
	
	
	private static boolean isPalindrome(String str) {
		
		int a_pointer = 0;
		int b_pointer = str.length()-1;
		
		
		while(a_pointer<b_pointer) {
			
			if(str.charAt(a_pointer) != str.charAt(b_pointer)) {
				return false;
			}
			
			a_pointer++;
			b_pointer--;
			
		}
		
		return true;
	}
}
