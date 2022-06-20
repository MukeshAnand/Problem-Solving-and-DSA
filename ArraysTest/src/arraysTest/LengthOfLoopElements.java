package arraysTest;
import java.util.LinkedList;

public class LengthOfLoopElements {
	
	public static void main(String[] args) {
		//int []array = {1, 0};
		//int []array = { 1,2,1};
		int []array = {1, 3, 0, 4, 1};
		
		
		System.out.println(countCycles(array));
		
	}
    

		
	
	//array = [1, 0]
	//array = [1, 2, 1]
	//array = [1, 3, 0, 4, 1]
	
	// 1->0->1
			
	
	public static int countCycles(int[] data) {
	    int[] counters = new int[data.length];
	    int index = 0;
	    int count = 0;
	    while(counters[index] == 0) {
	        counters[index] = count++;
	        index = data[index];
	    }
	    return count - counters[index];
	}
}