import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubArrayGivenSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int testCase = s.nextInt();

		while (testCase-- > 0) {
			int n = s.nextInt();
			int sumRes = s.nextInt();
			int[] a = new int[n];
			int sum = 0;

			for (int i = 0; i < n; i++) {
				a[i] = s.nextInt();
			}

			boolean found = false;
			int first = 1, last = 1, tempSum = 0;
			HashMap<Integer,Integer> hashmap =new HashMap<Integer,Integer>();
			hashmap.put(0,1);

			for (int i = 0; i < n; i++) {
				tempSum += a[i];
				
				if(tempSum == sumRes) {
					System.out.println(1 +" "+(i+1));
					found= true;
					break;
				}
				
				if(hashmap.containsKey(tempSum-sumRes)) {
			         System.out.println ((hashmap.get(tempSum-sumRes)+1) +" "+(i+1));
			         found= true;
			         break;
					
				}
				
				if(!hashmap.containsKey(tempSum)) {
					hashmap.put(tempSum, i+1);
				}
				
			}

			if (!found) {
				System.out.println(-1);
			}
		}

	}

}
