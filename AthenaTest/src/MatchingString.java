import java.util.Scanner;

public class MatchingString {

	public static void main(String[] args) {
		
		
		Scanner scr= new Scanner(System.in);
		
		
		int strLen = scr.nextInt();
		
		String []str = new String[strLen];
		
		int i=0;
		
		while(strLen --> 0) {  // 4 - 3 -2 -1 
			
			String curr = scr.next();
			
			str[i++]=curr;

		}
		
	    int qrLen = scr.nextInt();
		
		String []qr = new String[qrLen];
		
		int j=0;
		
		while(qrLen --> 0) {
			
			String curr = scr.next();
			
			qr[i++]=curr;

		}
		
		
		
		int []result = matchingStrings(str,qr);
		
		

	}
	
	/*strings = [ab, ab, abc] and queries = [ab, abc, bc],*/
	
	public static int[] matchingStrings(String[] str, String[] queries) {

		int[] result = new int[queries.length];

		if (str == null || str.length == 0) {
			return result;
		}

		for (int i = 0; i < queries.length; i++) {

			String currQuery = queries[i];

			int count = 0;

			for (int j = 0; j < str.length; j++) {

				if (currQuery.equals(str[i])) {

					count++;
				}

			}

			result[i] = count;

		}

		return result;

	}

}
