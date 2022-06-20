package Test;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class NonRepeatingCharacter {
   static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t;
        t = scan.nextInt();
        int f = 0;
        while (t > 0) {
            t = t - 1;
            if (f == 0) {
                scan.nextLine();
                f = 1;
            }
            int n = scan.nextInt();
          
            scan.nextLine();
         
            String str = scan.nextLine();
            
            int[] freq = new int[26];

            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                if (map.get(str.charAt(i)) == null) {
                    map.put(str.charAt(i), 1);
                } else {
                    map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
                }
            }

            int i = -1, flag = 0;
            while (i < str.length()-1) {
                i++;
                if (map.get(str.charAt(i)) == 1) {
                     flag = 1;
                    break;
                   
                }
            }
          if(flag==1)
          {
              System.out.println(str.charAt(i));
          }
          else
          {
              System.out.println("-1");
          }
        }

    }
}
  