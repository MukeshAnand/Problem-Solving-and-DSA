package arraysTest;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = getPrimes(25);
		
		list.stream().forEach(System.out::println);
	}
	
	public static List<Integer> getPrimes(int n){
		
		List<Integer> list = new ArrayList<>();
		
		
		while(n%2==0) {
			n/=2;
			list.add(2);
		}
		
		
		for(int i=3;i<=Math.sqrt(n);i++) {
			while(n%i==0) {
				n/=i;
				list.add(i);
			}
		}
		
		if(n>2) {
			list.add(n);
		}
		
		return list;
		
	}

}
