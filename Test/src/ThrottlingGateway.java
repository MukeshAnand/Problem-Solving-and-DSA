import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class ThrottlingGateway {
    public static final int MAX_PER_SECOND = 3;
    public static final int MAX_TEN_SECONDS = 20;
    public static final int MAX_PER_MINUTE = 60;
    
   // Constructor consturs = new Constructor(null, null, null, 0, 0, null, null, null);
    
    public static void main(String[] args) {
        int[] requestTime1 = new int[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 11, 11, 11, 6, 6, 6, 5, 5, 5};
        int[] requestTime2 = new int[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 11, 11, 11, 11};
        int[] requestTime3 = new int[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 8, 8, 8, 8, 9, 9, 9, 9, 9,
                10, 10, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 14, 14, 14, 14, 14, 16, 16, 16, 16, 16,
                16, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20};
        ThrottlingGateway test = new ThrottlingGateway();
        System.out.println(test.droppedRequests(requestTime1));
    }

    public int droppedRequests(int[] requestTime) {
        if (requestTime == null || requestTime.length == 0) {
            return 0;
        }
        int drop = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int lastReqTime = 0;
        for (int i : requestTime) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            
            lastReqTime = Math.max(lastReqTime, i);
        }
        System.out.println("map : "+map.entrySet());
        System.out.println("LastRequestTime : "+lastReqTime);
        
        
        int[] nums = new int[lastReqTime + 1];
        
        for (int i = 1; i < nums.length; ++i) {
        	
        	System.out.println(" ------------------------"+i+"------------------------");
            int numReqThisSecond = map.getOrDefault(i, 0);
            System.out.println("NumReqThisSecond : "+numReqThisSecond);
            nums[i] = nums[i - 1] + numReqThisSecond;
            System.out.println("nums[i] "+nums[i]);
            if (numReqThisSecond == 0) {
                continue;
            }
            int toDrop = 0;
            if (numReqThisSecond > MAX_PER_SECOND) {
                toDrop = Math.max(toDrop, numReqThisSecond - MAX_PER_SECOND);
            }

            int timeTenSecondsAgo = Math.max(i - 10, 0);
            
            int numReqPastTenSecond = nums[i] - nums[timeTenSecondsAgo];
            System.out.println("nums[i] "+nums[i]);
            System.out.println("nums[timeTenSecondsAgo] "+nums[timeTenSecondsAgo]);
            System.out.println("numReqPastTenSecond : "+numReqPastTenSecond);
            if (numReqPastTenSecond > MAX_TEN_SECONDS) {
                int numReqExceeded = Math.min(numReqThisSecond, numReqPastTenSecond - MAX_TEN_SECONDS);
                toDrop = Math.max(toDrop, numReqExceeded);
            }

            int timeOneMinuteAgo = Math.max(i - 60, 0);
            int numReqPastMinute = nums[i] - nums[timeOneMinuteAgo];
            System.out.println("nums[i] "+nums[i]);
            System.out.println("nums[timeOneMinuteAgo] "+nums[timeOneMinuteAgo]);
            System.out.println("numReqPastMinute : "+numReqPastMinute);
            if (numReqPastMinute > MAX_PER_MINUTE) {
                int numReqExceeded = Math.min(numReqThisSecond, numReqPastMinute - MAX_PER_MINUTE);
                toDrop = Math.max(toDrop, numReqExceeded);
            }
            drop += toDrop;
            
            System.out.println("Drop  : "+drop);
            
            System.out.println(" ------------------------"+i+"------------------------");
        }
        
        for(int i=0;i<nums.length;i++) {
        	System.out.print(nums[i]+",");
        }
        return drop;
    }
}