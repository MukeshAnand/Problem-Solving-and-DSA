import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
/*
 * 
Example test:   ['039', '4', '14', '32', '', '34', '7']
OK

Example test:   ['801234567', '180234567', '0', '189234567', '891234567', '98', '9']
OK

Example test:   ['5421', '245', '1452', '0345', '53', '354']
OK

Your test case: ['039', '4', '14', '32', '', '34', '7']
Returned value: 5
 */

public class NewSolution {

	public static void main(String[] args) {
		
		String[] E= {"039","4","14","32","34","7"};
		

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<E.length;i++){
            for(char c:E[i].toCharArray()){
                 map.put(c-'0', map.getOrDefault(c-'0',0)+1);
            }
        }
        
        for(Entry<Integer, Integer> e:map.entrySet()) {
        	
        	System.out.println(e.getKey()+" "+e.getValue());
        	
        }
	}
}
