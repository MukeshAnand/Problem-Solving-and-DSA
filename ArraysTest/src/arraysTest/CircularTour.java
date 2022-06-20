package arraysTest;

public class CircularTour {

	int tour(int petrol[], int distance[])
    {
	   int n  = petrol.length;
	   
	   int sum=0, diff=0,start=0;
	   
	   for(int i=0;i<n;i++){
	       
	       sum = sum + petrol[i] - distance[i];
	       
	       if(sum<0){
	           start =i+1;
	           diff = diff+sum;
	           sum =0;
	       }
	       
	       
	   }
	   
	   return sum +diff >=0?start:-1;
    }
	
	public static void main(String[] args) {
		
		int petrol[] = { 4,6,7,4 };
		
		int distance[] = {6,5,3,5};
		
		CircularTour circular = new CircularTour();
		
		System.out.println(circular.tour(petrol, distance));
	}
}
