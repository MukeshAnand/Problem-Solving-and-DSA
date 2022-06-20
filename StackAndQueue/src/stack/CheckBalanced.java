// Java program for checking 
// balanced Parenthesis 
package stack;

import java.util.*; 

public class CheckBalanced { 

	// function to check if paranthesis are balanced 
	static boolean areParanthesisBalanced(String expr) 
	{ 
		// Using ArrayDeque is faster than using Stack class 
		Deque<Character> stack = new ArrayDeque<Character>(); 
		
		

		// Traversing the Expression 
		for (int i = 0; i < expr.length(); i++) { 
			char x = expr.charAt(i); 

			if (x == '(' || x == '[' || x == '{') { 
				// Push the element in the stack 
				stack.push(x); 
				continue; 
			} 

			// IF current current character is not opening 
			// bracket, then it must be closing. So stack 
			// cannot be empty at this point. 
			if (stack.isEmpty()) 
				return false; 

          
            System.out.println("X value" + x);
			switch (x) { 
			case ')': 
				 System.out.println("X value before stack pop " + x);
				x=stack.pop();
				 System.out.println("X value after stack pop " + x);
				if (x == '{' || x == '[') 
					return false; 
				break; 

			case '}': 
				 System.out.println("X value before stack pop " + x);
				x=stack.pop(); 
				 System.out.println("X value before stack pop " + x);
				if (x == '(' || x == '[') 
					return false; 
				break; 

			case ']': 
				 System.out.println("X value before stack pop " + x);
				x=stack.pop(); 
				 System.out.println("X value before stack pop " + x);
				if (x == '(' || x == '{') 
					return false; 
				break; 
			} 
		} 

		// Check Empty Stack 
		return (stack.isEmpty()); 
	} 

	/*driver program to test above functions*/
	public static void main(String[] args) 
	{ 
		String expr = "([{}])"; 
		if (areParanthesisBalanced(expr)) 
			System.out.println("Balanced "); 
		else
			System.out.println("Not Balanced "); 
	} 
} 
