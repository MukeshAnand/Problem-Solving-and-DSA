import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//
		
		int arr[] = { 8,16,3,4,2};

		//16, 4, 2 
		
		int max=arr[arr.length-1];
		
		List<Integer> list = new ArrayList<>();
		
		list.add(max);
		
		for(int i=arr.length-2;i>=0;i--) {
			
			if(arr[i]>=max) {
				max= arr[i];
				list.add(arr[i]);
				
			}
		}

	}

}

//Notification Service

// Client A(Email) / B(SMS)/ C (Email/SMS) (subscribed from NS)

//if infy stocks drops 50%


//Preference known



Nofitication

NotificationDeamon (Checkes 5sec) -- If infy reduces earlier data (50%) //Singleton

if (<50%) {
	do nothing;
}
if(>=50) {
	
	NoficationFactory 
	
}

INofication (nofity)
EmailNotifcation implement   (Email (from,to, body,subject))
SMSNotification  (Email (from,to, content,subject))


ValidatorDropPercentage -- 


SMTPServerWorker ()

Consumer  

--fetches all the subscribers (list of Subscriber Id) Constructor 

SetEvent() // id , percentage drop

send()-- list of subscribers 

FactoryI

