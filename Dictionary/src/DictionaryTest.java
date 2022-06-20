import java.util.*;
import java.io.*;



public class DictionaryTest {
	
	static Set<String> set = new HashSet<>();
	
	public static void main(String[] args) {
		
		String []dic = { "i", "like","mango","man","go", "ke"};
		
	   for(String s: dic) {
		   set.add(s);
	   }
	   
	   String str="ilikemango";
	   
	   StringBuffer result = new StringBuffer();
	   
	   int j=1;
	  int a_pointer = 0;

	  
	  for(int i=1;i<str.length()+1;i++) {
		 
		  
		  if (a_pointer<i && set.contains(str.substring(a_pointer , i))) {
			  result.append(str.substring(a_pointer , i)).append(" ");
			  a_pointer=i;
		  }
		  
	  }
	   
	   System.out.println(result.toString());
	   
		
	}

}
