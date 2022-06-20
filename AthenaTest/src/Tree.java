import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tree {

	List<Integer> result = new ArrayList<>();
	
	
	public static void main(String[] args) {
	
		
		Scanner scr = new Scanner(System.in);
		
		int num = scr .nextInt();
		
		TreeNode root = new TreeNode(1);
		
		
		int i=1;
		
		
		while(num-->0) {
			
			
			String str[] = scr.nextLine().split("\\ ");
			
			
			int left=Integer.parseInt(str[0]);
			
			int right=Integer.parseInt(str[1]);

			root.left = new TreeNode(left);
			
			root.right = new TreeNode(right);
			
			
			
		}
		
		

	}
	
	
	public TreeNode treeTraverse(TreeNode node) {
		
		
		if(node == null) {
			return node;
		}
		
		
		TreeNode left = treeTraverse(node.left);
		
		TreeNode right = treeTraverse(node.right);
		
		
		node.left=right;
		
		node.right=left;
		
		
		return node;
	
	}
	
	public void inOrder(TreeNode node){
		
		if(node!=null) {		
			inOrder(node.left);
			result.add(node.val);
			inOrder(node.right);
		}
		
	}
	


}


class TreeNode {
	
	int val;
	
	TreeNode left,right;
	
	TreeNode(int val){
		this.val = val;
		
		this.left = null;
		this.right = null;
	}
}