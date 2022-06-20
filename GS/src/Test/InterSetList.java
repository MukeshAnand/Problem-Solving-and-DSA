package Test;

public class InterSetList {
	
	Node head1,head2;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		
		InterSetList list = new InterSetList();
		
		// creating first linked list 
        list.head1 = list.new Node(3); 
        list.head1.next = list.new Node(6); 
        list.head1.next.next = list.new Node(9); 
        list.head1.next.next.next = list.new Node(15); 
        list.head1.next.next.next.next = list.new Node(30); 
        list.printList(list.head1);
  
        // creating second linked list 
        list.head2 = list.new Node(10); 
        list.head2.next = list.new Node(15); 
        list.head2.next.next = list.new Node(30); 
        list.printList(list.head2);
		System.out.println(list.interSetList(list.head1, list.head2));

	}
	
    private int interSetList(Node head12, Node head22) {
		
    	int c1 = countList(head12);
    	int c2 = countList(head22);
    	Node current1 = head12;
    	Node current2 = head22;
    	int d=0;
    	
    	if(c2>c1) {
    		d= c2-c1;
    		for(int i=0;i<d;i++) {
    			current2 = current2.next;
    		}
    	}else {
    		d=c1-c2;
    		for(int i=0;i<d;i++) {
    			current1 = current1.next;
    		}
    	}
    	
    	while(current1!=null &&current2!=null) {
    		if(current1 == current2) {
    		return current1.data;
    		}
    		current1 = current1.next;
    		current2 = current2.next;
    	}
    	return -1;
	}
    
    int countList(Node head) {
    	
    	int count = 0;
    	
    	Node temp = head;
    	
    	while(temp.next!=null) {
    		temp = temp.next;
    		count++;
    	}
    	return count;
    }

	void printList(Node head) {
    	
    	Node node = head;
    	
    	
    	while(node!=null) {
    		
    		System.out.print(node.data+"->");
    		node =node.next;
    	}
    	System.out.println();
		
    }
	
   
	

}


