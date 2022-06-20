package com.interview.tree;
/**
 * 
 * @author mukesha
 *
 * Find lowest common ancestor in binary tree.
 *
 * Time complexity O(n)
 * Space complexity O(h)
 * 
 * 
 */

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}

public class LeastCommonAncesetor {
	
	Node node;
	
	static class Node{
		Node left,right;
		int data;
		
		Node(int data){
			this.data= data;
			left=right=null;
		}
	}

	public static void main(String[] args) {
		
		LeastCommonAncesetor l = new LeastCommonAncesetor();
		l.node = new Node(1);
		l.node.left = new Node(2);
		l.node.left.left = new Node(4);
		l.node.right = new Node(3);
		l.node.left.right = new Node(5);
		
		//l.printInOrder(l.node);
		
		B b= new B();
   
		System.out.println((b instanceof A)+""+(b instanceof C)+""+(b instanceof B));
		
		
	}
	

	
	public void printInOrder(Node root) {
		
		if(root== null) {
			return;
		}
		
		System.out.println(root.data);
		
		printInOrder(root.left);
		
		printInOrder(root.right);
		
		
		Runnable r = ()->System.out.println(1);
		
	}
	
	public Node LCA(Node root, int n1,int n2) {
		
		
		if(root ==null) {
			return null;
		}
		
		if(root.data ==n1||root.data==n2) {
			return root;
		}
		
		Node left = LCA(root.left,n1,n2);
		Node right = LCA(root.right,n1,n2);
		
		if(left!=null&&right!=null) {
			return root;
		}
		
		return left!=null?left:right;
		
	}
	
	// Returns the LCA of the nodes with values n1 and n2
    // in the Binary Search Tree rooted at 'root' 
	Node LCABST(Node root, int n1, int n2)
	{
       if(root.data>Math.max(n1,n2)){
           return LCA(root.left,n1,n2);
       }else if(root.data<Math.min(n1,n2)){
           return LCA(root.right,n1,n2);
       }else{
           return root;
       }
    }
}
