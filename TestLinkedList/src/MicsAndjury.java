import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class MicsAndjury {
	
	public static void main(String[] args) {
		
		
	}

	
	  static int micsandjury(int N,int M,int[] teams){
	        
	        int res = 0;
	        
	        Integer[] n = new Integer[M];
	        
	        System.arraycopy(teams, 0, n, 0, M);
	        
	        Arrays.sort(n,Collections.reverseOrder());
	        
	        int diff=0;
	        
	        diff =N-M; 
	       
	        for(int i=0;i<diff;i++) {
	        	int d= n[0]/2;
	        	if(!(d<=0)) {
	        		if(d>n[1]) {
	        			res=d;
	        			n[0]=d;
	        		}else {
	        			n[0]=n[1];
	        		}
	        	}
	        	
	        }
	        return res;
	        
	        
	        
	    }
}
