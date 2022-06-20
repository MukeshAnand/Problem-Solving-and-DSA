

public class ReverseLinkedList {
	
	static class Node{
		Node next;
		int data;
		Node(int data){
			this.data=data;
			next =null;
		}
	}
	
	public static void main(String[] args) {
		ReverseLinkedList l = new ReverseLinkedList();
		
		Node head = new Node(0);
		head.next = new Node(1);
		head.next.next = new Node(2);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(4);
		head.next.next.next.next.next = new Node(5);
		
		head = l.reverseLinkedList(head, 2, 4);
		
		Node temp = head;
		
		
		while(temp!=null) {
			System.out.println(temp.data);
			temp =temp.next;
		}
		
		
		
	}
	
	public Node reverseLinkedList(Node head, int  start, int end) {
		
		Node prev= null;
		Node next = null;
		Node current = head;
		
		Node temp = head;
		
		Node endNode = head;
		int startTemp = start;
		
		while(start!=1) {
			temp = temp.next;
			start--;
		}
		int endTemp = end;
		
		 while(!(endTemp < 0)) {
			 
			 endNode = endNode.next;
			 endTemp--;
			 
		 }
		
		current=temp.next;
		
		int diff = end - startTemp; //4-2  0 1 2 3 4 5 
		  //0 1 4 3 2 5
		
		while(current !=null && !(diff < 0)) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;	
			diff--;
		}
		temp.next = prev;
		
		while(temp.next!=null) {
			temp = temp.next;
			
		}
		
		temp.next = endNode;
		
		return head;
		
	}
	
  	
}
