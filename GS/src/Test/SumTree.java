package Test;

// Java program to check if Binary tree is sum tree or not 

/* A binary tree node has data, left child and right child */
class BinaryNode 
{ 
	int data; 
	BinaryNode left, right, nextRight; 

	BinaryNode(int item) 
	{ 
		data = item; 
		left = right = nextRight = null; 
	} 
} 

class BinaryTree 
{ 
	BinaryNode root; 

	/* A utility function to get the sum of values in tree with root 
	as root */
	int sum(BinaryNode node) 
	{ 
		if (node == null) 
			return 0; 
		return sum(node.left) + node.data + sum(node.right); 
	} 

	/* returns 1 if sum property holds for the given 
	node and both of its children */
	int isSumTree(BinaryNode node) 
	{ 
		int ls, rs; 

		/* If node is NULL or it's a leaf node then 
		return true */
		if ((node == null) || (node.left == null && node.right == null)) 
			return 1; 

		/* Get sum of nodes in left and right subtrees */
		ls = sum(node.left); 
		rs = sum(node.right); 

		/* if the node and both of its children satisfy the 
		property return 1 else 0*/
		if ((node.data == ls + rs) && (isSumTree(node.left) != 0) 
				&& (isSumTree(node.right)) != 0) 
			return 1; 

		return 0; 
	} 
	
	
	int isLeaf(BinaryNode node)  
    { 
        if (node == null) 
            return 0; 
        if (node.left == null && node.right == null) 
            return 1; 
        return 0; 
    } 
   
    /* returns 1 if SumTree property holds for the given 
       tree */
    int isSumTreeEfficient(BinaryNode node)  
    { 
        int ls; // for sum of nodes in left subtree 
        int rs; // for sum of nodes in right subtree 
   
        /* If node is NULL or it's a leaf node then 
         return true */
        if (node == null || isLeaf(node) == 1) 
            return 1; 
   
        if (isSumTree(node.left) != 0 && isSumTree(node.right) != 0)  
        { 
            // Get the sum of nodes in left subtree 
            if (node.left == null) 
                ls = 0; 
            else if (isLeaf(node.left) != 0) 
                ls = node.left.data; 
            else
                ls = 2 * (node.left.data); 
   
            // Get the sum of nodes in right subtree 
            if (node.right == null) 
                rs = 0; 
            else if (isLeaf(node.right) != 0) 
                rs = node.right.data; 
            else
                rs = 2 * (node.right.data); 
               
            /* If root's data is equal to sum of nodes in left 
               and right subtrees then return 1 else return 0*/
            if ((node.data == rs + ls)) 
                return 1; 
            else
                return 0; 
        } 
   
        return 0; 
    } 

	/* Driver program to test above functions */
	public static void main(String args[]) 
	{ 
		BinaryTree tree = new BinaryTree(); 
		tree.root = new BinaryNode(26); 
		tree.root.left = new BinaryNode(10); 
		tree.root.right = new BinaryNode(3); 
		tree.root.left.left = new BinaryNode(4); 
		tree.root.left.right = new BinaryNode(6); 
		tree.root.right.right = new BinaryNode(3); 

		if (tree.isSumTree(tree.root) != 0) 
			System.out.println("The given tree is a sum tree"); 
		else
			System.out.println("The given tree is not a sum tree"); 
	} 
} 

// This code has been contributed by Mayank Jaiswal 

