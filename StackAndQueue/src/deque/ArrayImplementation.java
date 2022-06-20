package deque;


// Java implementation of De-queue using circular 
// array 
   
// A structure to represent a Deque 
class ArrayImplementation 
{ 
    static final int MAX = 100; 
    int  arr[]; 
    int  front; 
    int  rear; 
    int  size; 
      
    public ArrayImplementation(int size) 
    { 
        arr = new int[MAX]; 
        front = -1; 
        rear = 0; 
        this.size = size; 
    } 
   
    /*// Operations on Deque: 
    void  insertfront(int key); 
    void  insertrear(int key); 
    void  deletefront(); 
    void  deleterear(); 
    bool  isFull(); 
    bool  isEmpty(); 
    int  getFront(); 
    int  getRear();*/
    
    boolean isFull1() {
    	
    	return (front==0&&rear==size-1)||(front==rear+1);
    }
    
    
    
    
    void insertFront1(int key) {
    	
    	
    	if(isFull1()) {
    		System.out.println("Overflow");
    		return;
    	}
    	
    	//If queue is empty
    	if(front == -1) {
    		front = 0;rear =0;
    	}else if(front ==0) {
    		front =size-1;
    		
    	}else {
    		front = front -1;
    	}
    	
    	arr[front] = key;
    	
    	
    }
    
    
    void insertRear1(int key) {
    	if(isFull()) {
    		System.out.println("OVerflow");
    		return;
    	}
    	
    	if(front==-1) {
    		front =0;
    		rear =0;
    	}else if(rear== size-1){
            rear =0;    		
    	}else {
    		rear = rear +1;
    	}
    	
    	arr[rear] = key;
    }
    
    boolean isEmpty1() {
    	 return front ==-1 &&rear ==-1;
    }
    
    void deleteFront1() {
    	
    	if(isEmpty()) {
    		System.out.println("Underflow");
    		
    		
    	return;
    	}
    	
    	
    	if(front==rear) {
    		front = -1;
    		rear = -1;
    	}else {
    		if(front  == size-1) {
    			front =0;
    		}else {
    			front = front +1;
    		}
    	}
    	
    }
    
    
    void deleteRear() {
    	
    	if(isEmpty()) {
    		System.out.println("UnderFlow");
    		return;
    	}
    	
    	if(front == rear) {
    		front =-1;
    		rear =-1;
    	}else {
    		if(rear == 0) {
    			rear =-1;
    		}else {
    			rear = rear -1;
    		}
    	}
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    // Checks whether Deque is full or not. 
    boolean isFull() 
    { 
        return ((front == 0 && rear == size-1)|| 
            front == rear+1); 
    } 
   
    // Checks whether Deque is empty or not. 
    boolean isEmpty () 
    { 
        return (front == -1); 
    } 
   
    // Inserts an element at front 
    void insertfront(int key) 
    { 
        // check whether Deque if  full or not 
        if (isFull1()) 
        { 
            System.out.println("Overflow");  
            return; 
        } 
   
        // If queue is initially empty 
        if (front == -1) 
        { 
            front = 0; 
            rear = 0; 
        } 
          
        // front is at first position of queue 
        else if (front == 0) 
            front = size - 1 ; 
   
        else // decrement front end by '1' 
            front = front-1; 
   
        // insert current element into Deque 
        arr[front] = key ; 
    } 
   
    // function to inset element at rear end 
    // of Deque. 
    void insertrear(int key) 
    { 
        if (isFull1()) 
        { 
            System.out.println(" Overflow "); 
            return; 
        } 
   
        // If queue is initially empty 
        if (front == -1) 
        { 
            front = 0; 
            rear = 0; 
        } 
   
        // rear is at last position of queue 
        else if (rear == size-1) 
            rear = 0; 
   
        // increment rear end by '1' 
        else
            rear = rear+1; 
          
        // insert current element into Deque 
        arr[rear] = key ; 
    } 
   
    // Deletes element at front end of Deque 
    void deletefront() 
    { 
        // check whether Deque is empty or not 
        if (isEmpty()) 
        { 
            System.out.println("Queue Underflow\n"); 
            return ; 
        } 
   
        // Deque has only one element 
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else
            // back to initial position 
            if (front == size -1) 
                front = 0; 
   
            else // increment front by '1' to remove current 
                // front value from Deque 
                front = front+1; 
    } 
   
    // Delete element at rear end of Deque 
    void deleterear() 
    { 
        if (isEmpty()) 
        { 
            System.out.println(" Underflow"); 
            return ; 
        } 
   
        // Deque has only one element 
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else if (rear == 0) 
            rear = size-1; 
        else
            rear = rear-1; 
    } 
   
    // Returns front element of Deque 
    int getFront() 
    { 
        // check whether Deque is empty or not 
        if (isEmpty()) 
        { 
            System.out.println(" Underflow"); 
            return -1 ; 
        } 
        return arr[front]; 
    } 
   
    // function return rear element of Deque 
    int getRear() 
    { 
        // check whether Deque is empty or not 
        if(isEmpty() || rear < 0) 
        { 
            System.out.println(" Underflow\n"); 
            return -1 ; 
        } 
        return arr[rear]; 
    } 
   
    // Driver program to test above function 
    public static void main(String[] args) 
    { 
          
    	ArrayImplementation dq = new ArrayImplementation(5); 
           
         System.out.println("Insert element at front end  : 5 "); 
         dq.insertfront(5); 
           
         System.out.println("insert element at rear end : 10 "); 
         dq.insertrear(10); 
       
         System.out.println("insert element at rear end : 11 "); 
         dq.insertrear(11);
         
         System.out.println("insert element at rear end : 12 "); 
         dq.insertrear(12);
        
         System.out.println("insert element at rear end : 13 "); 
         dq.insertrear(13);
        
         System.out.println("insert element at rear end : 14 "); 
         dq.insertrear(14);
           
         System.out.println("get rear element : "+ dq.getRear()); 
           
         dq.deleteRear(); 
         System.out.println("After delete rear element new rear become : " +  
                                dq.getRear()); 
           
         System.out.println("inserting element at front end"); 
         dq.insertfront(15); 
           
         System.out.println("get front element: " +dq.getFront()); 
           
         dq.deletefront(); 
           
         System.out.println("After delete front element new front become : " + 
                                    +  dq.getFront()); 
          
    } 
} 