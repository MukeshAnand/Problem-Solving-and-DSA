package com.interview.tree;
 /* Youtube link - https://youtu.be/MILxfAbIhrE
 * 
 * Given a binary tree, return true if it is binary search tree else return false.
 * 
 * Solution
 * Keep min, max for every recursion. Initial min and max is very small and very larger
 * number. Check if root.data is in this range. When you go left pass min and root.data and 
 * for right pass root.data and max.
 * 
 * Time complexity is O(n) since we are looking at all nodes.
 * 
 * Test cases:
 * Null tree
 * 1 or 2 nodes tree
 * Binary tree which is actually BST
 * Binary tree which is not a BST
 */
public class isBST {

    public boolean isBST(TreeNode root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private boolean isBST(TreeNode root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.data <= min || root.data > max){
            return false;
        }
        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }
    
	public static void main(String args[]) 
	{ 
		/* creating a binary tree and entering the nodes */
		BinaryTreeTest tree = new BinaryTreeTest(); 
		tree.root = new TreeNode(3); 
		tree.root.left = new TreeNode(1); 
		tree.root.right = new TreeNode(4); 
		tree.root.left.right = new TreeNode(2);
		
		tree.root.right.right = new TreeNode(5); 

		isBST isbst = new isBST();
		System.out.println("Is binary search tree : "
						+ isbst.isBST(tree.root)); 
	} 
 }
