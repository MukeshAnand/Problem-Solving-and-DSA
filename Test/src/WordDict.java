import java.util.*;

/*
 * Given a string S and dictionary of words dict. Check if string S can be segmented into one or more dictionary words
	Example:
	S = “ilikepizza”
	dict = [“pizza”, “burger”, “like”, “i”, “ili”]

	Note - same word can be used multiple times in segmentation
	Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
    Output: false
	
	Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
    Output: ["cats and dog","cat sand dog"]
	
 */
public class WordDict {
	
	static HashSet<String> set;

	public static void main(String[] args) {
		set = new HashSet<>();
/*
		set.add("pizza");
		set.add("burger");
		set.add("like");
		set.add("i");
		set.add("ili");
		
		
		set.add("epizza");
		set.add("like");
		set.add("i");
		set.add("lik");
		set.add("pizza");
		*/
		
		set.add("cat");
		set.add("cats");
		set.add("and");
		set.add("sand");
		set.add("dog");

		String str = "catsanddog";

		String result = ""; 

		for (int i = 0; i < str.length(); i++) {   

			for (int j = 0; j <= str.length()&& j>=i; j++) { 

				String s = new StringBuilder(str.substring(i, j)).toString();

				if (set.contains(s)) {
					result += s + " ";
					//i = j;
				}
			}

		}
		
		String temp = "";
		
		for(char c:result.toCharArray()) {
			
			if(Character.isLetter(c)) {
				temp+=c;
			}
		}
		if(temp==str) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
		//System.out.println("Result : "+result);

	}
	
	

}
