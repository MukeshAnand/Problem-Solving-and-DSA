import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class TestSum {

	public static void main(String[] args) {
		
		int arr[]= {1,4,5,8,9};
		
		int res[]=getSum(arr, 10);
		
		for(int r:res) {
			System.out.print(r+" ");
		}
		
		String str= "amit kumar";
		
		List<String> list = Arrays.asList(str.split(""));
		
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
	   for(Entry<String, Long> entry:map.entrySet()) {
		   
		   
		   System.out.println(entry.getKey()+" "+entry.getValue());
	   }

	}
	
	private static int[] getSum(int arr[], int sum) {
		
		Set<Integer> set = new HashSet<>();
		
		
		for(int i=0;i<arr.length;i++) {
			
			int k=sum-arr[i]; //  b=sum-a
				
			if(set.contains(k)) {
				return new int[] {arr[i],k};
			}
			
			set.add(arr[i]); //
		}
		
		return new int[] {-1,-1};
		
	}

}
