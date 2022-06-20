import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Test {

	
	public static void main(String[] args) {
		
		//String str = "{[]{[}]}";
		
		String str = "}{";
		
		isBalanced(str);
		
		
		List<String> name = new ArrayList<>();
		
		
		name.add("Arun");
		name.add("babu");
		name.add("chandru");
		
		
		name.stream().sorted();
		
	}
	
	




public static void isBalanced(String str) {
	
	int len= str.length();
	
	Deque queue = new LinkedList();
	

	
	//Deque openBraces = new LinkedList();
	
	for(int i=0;i<len;i++) {
		
		char c = str.charAt(i);
		
		if(c =='{') {
			queue.push(c);
		}
		
		if(c =='[') {
			queue.push(c);
		}
		
		
		if(!queue.isEmpty()&&queue.peekLast().toString().equals("[")) {
			queue.removeLast();
		}
		
		if(!queue.isEmpty()&&queue.pollLast().toString().equals("{")) {
			queue.removeLast();
		}
		
	}
	
	if(queue.isEmpty()) {
		System.out.println("Balanced");
	}else {
		System.out.println("Not Balanced");
	}
	
}

}


