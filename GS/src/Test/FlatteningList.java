package Test;

public class FlatteningList {
	
	Node head;
	
	class Node{
		int data;
		Node right, down;
		
		Node(int data){
			this.data = data;
			this.right = null;
			this.down  = null;
		}
	}

	public static void main(String[] args) {
		
		FlatteningList m = new FlatteningList();
		
		m.head=m.push(m.head,30);
		m.head=m.push(m.head, 8);
		m.head=m.push(m.head,7);
		m.head=m.push(m.head, 5);
		
		m.head.right=m.push(m.head.right,20);
		m.head.right=m.push(m.head.right, 10);
		
		m.head.right.right=m.push(m.head.right.right,50);
		m.head.right.right=m.push(m.head.right.right, 22);
		m.head.right.right=m.push(m.head.right.right, 19);
		
		m.head.right.right.right=m.push(m.head.right.right.right,45);
		m.head.right.right.right=m.push(m.head.right.right.right, 40);
		m.head.right.right.right=m.push(m.head.right.right.right, 35);
		m.head.right.right.right=m.push(m.head.right.right.right, 20);
		
		m.head = m.flatteningNode(m.head);
		m.printList();

	}
	
    Node push (Node head,int d) {
		Node node = new Node(d);
		
		node.down =head;
		 
		head = node;
		
		return head;
		
	}
    void printList() {
    	
    	Node node = head;
    	
    	
    	while(node!=null) {
    		
    		System.out.print(node.data+"->");
    		node =node.down;
    	}
    	System.out.println();
		
    }
	
    
    Node flatteningNode(Node root) {
    	
    	if(root ==null || root.right ==null) {
    		return root;
    	}
    	
    	root.right = flatteningNode(root.right);
    	
    	root = merge(root,root.right);
    	
    	return root;
    }

	private Node merge(Node root, Node right) {
		if(root == null) {
			return right;
		}
		if(right == null) {
			return root;
		}
		
		Node result;
		
		if(root.data < right.data) {
			result = root;
			result.down = merge(root.down,right);
			
		}else {
			result = right;
			result.down = merge(root, right.down);
		}
		
		result.right =null;
		
		
		return result;
	}
    	
    
    
	

}


