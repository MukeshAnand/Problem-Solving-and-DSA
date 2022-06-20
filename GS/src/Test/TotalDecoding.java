package Test;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class TotalDecoding {
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		int test = Integer.parseInt(read.readLine());

		while (test-- > 0) {

			int n = Integer.parseInt(read.readLine());

			String str = read.readLine();

			char[] digits = new char[n];

			for (int i = 0; i < n; i++) {
				digits[i] = str.charAt(i);
			}

			int ways = countWays(digits, n);

			System.out.println(ways);
		}
	}

	public static int countWays(char[] digits, int n) {

		if (digits[0] == '0') {
			return 0;
		}

		if (n == 0 || n == 1) {
			return 1;
		}

		int count = 0;

		if (digits[n - 1] > 0) {
			count = countWays(digits, n - 1);
		}

		if (digits[n - 2] == '1' || (digits[n - 2] == '2' && digits[n - 1] < '7')) {
			count += countWays(digits, n - 2);
		}

		return count;

	}

	static int countDecodingDP(char digits[], int n) {
// A table to store results of subproblems 
		int count[] = new int[n + 1];
		count[0] = 1;
		count[1] = 1;
		if (digits[0] == '0') // for base condition "01123" should return 0
			return 0;
		for (int i = 2; i <= n; i++) {
			count[i] = 0;

// If the last digit is not 0,  
// then last digit must add to 
// the number of words 
			if (digits[i - 1] > '0')
				count[i] = count[i - 1];

// If second last digit is smaller 
// than 2 and last digit is smaller 
// than 7, then last two digits  
// form a valid character 
			if (digits[i - 2] == '1' || (digits[i - 2] == '2' && digits[i - 1] < '7'))
				count[i] += count[i - 2];
		}
		return count[n];
	}
}