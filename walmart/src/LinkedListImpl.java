
public class LinkedListImpl {
	
	static Node head,tail, preDelete;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		head = new Node(0);
		tail= head;
		
		
		
		
		// First add 1, 2,3
		
		addNode(new Node(1));
		addNode(new Node(2));
		addNode(new Node(3));
		addNode(new Node(4));
		addNode(new Node(5));
		
		System.out.println("Head Node ");
		print(head.next);

		delete();
		
		System.out.println("Head Node After Delete ");
		print(head.next);
		
		addNode(new Node(6));
		
		System.out.println("Head Node add Node");
		print(head.next);
		
		
	}
	
	
	
	public static void addNode(Node node) {
		
		tail.next=node;
		
		preDelete=tail;
		tail=tail.next;
		
	}
	
	public static void print(Node node) {
		
		if(node == null) {
			return;
		}
		
		while(node!=null) {
			System.out.println(node.val);
			node=node.next;
		}
	}
	
	public static void delete() {  // 1, 2,3 ,4, 5
		
		Node preDelete=head.next;
		
		
		while(preDelete!=null && preDelete.next!=null && preDelete.next.next !=null) {
			preDelete=preDelete.next;
		}	
		
		
		preDelete.next=null;
		
		tail=preDelete;
		
		
	}

}



class Node{
	
	int val;
	
	Node next;
	
	Node(int val){
		this.val=val;
	}
	
}
