package com.interview.tree;
/**
 * Time Complexity O(n)
 * Space Comeplexity O(n)
 */
public class HeightOfTree {

	
	
	static class TNode{
		int data;
		TNode left,right;
		TNode root;
		
		TNode(int data ){
			this.data = data;
			
			left=right=null;
		}
		TNode(){
			
		}
	}
	public static void main(String args[]) 
	{ 
		HeightOfTree h= new HeightOfTree();
		/* creating a binary tree and entering the nodes */
		TNode tree= new TNode();  
		tree.root = new TNode(1);
		tree.root.left = new TNode(2); 
		tree.root.right = new TNode(3); 
		tree.root.left.left = new TNode(4); 
		tree.root.left.right = new TNode(5); 

		System.out.println("The Height of given binary tree is : "
						+ h.height(tree.root)); 
	}
	private int  height(TNode tree) {
		
		if(tree==null) {
			return 0;
		}

		return Math.max(height(tree.left), height(tree.right))+1;
	} 
}
