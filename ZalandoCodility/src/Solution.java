
public class Solution {
	
    public int solution(int[] A) {
        // write your code in Java SE 8

        int count = 0;

        for(int i=1;i<A.length;i++){
            count += Math.max(0, A[i-1]-A[i]);
        }
        return count + A[A.length-1];
    }

}
