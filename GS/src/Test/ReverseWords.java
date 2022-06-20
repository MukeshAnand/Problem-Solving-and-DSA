package Test;

import java.util.Scanner;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		
		String[] str = scr.nextLine().split(" ");
		
		String res = new String();
		
		
		for(int i =0;i<str.length;i++) {
			
			if(i==str.length-1) {
				res = str[i] +res;
				
			}else {
			
			res = " " +str[i] +res;
			}
			
			
		}
		
		
		System.out.println(res);
		
		
	}

}
