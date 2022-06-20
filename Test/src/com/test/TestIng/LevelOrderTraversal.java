package com.test.TestIng;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	static Node node;
	
	public static void main(String[] args) {
		
		LevelOrderTraversal l = new LevelOrderTraversal();
		l.node = new Node(1);
		l.node.left = new Node(2);
		l.node.left.left = new Node(4);
		l.node.right = new Node(3);
		l.node.left.right = new Node(5);
		
		int n = height(node);
		
		for(int i=1;i<=n;i++) {
			printLevel(node,i);
		}
		
		printLevelOrderUsingQueue(node);
		
	}
	
	static class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data=d;
			left=right=null;
		}
	}
	
	static int height(Node n) {
		if(n==null)
			return 0;
	    
		int lHeight=height(n.left);
		int rHeight=height(n.right);
		
		if(rHeight>lHeight) {
			return rHeight+1;
		}else {
			return lHeight+1;
		}
	}
	
	public static void printLevel(Node n,int level) {
		
		if(n ==null) {
			return;
		}
		if(level ==1) {
		
			System.out.print(n.data+ " ");
		}else if(level>1){
			 printLevel(n.left,level-1);
			 printLevel(n.right,level-1);
		}
	}
	
	public static void printLevelOrderUsingQueue(Node n) {
		
		Queue<Node> queue = new LinkedList<Node>();
		
		queue.add(n);
		
		
		while(!queue.isEmpty()) {
			
			Node node = queue.poll();
			
			System.out.print(node.data+" ");
			
			if(node.left!=null) {
				queue.add(node.left);
			}
			
			if(node.right !=null) {
				queue.add(node.right);
			}
		}
		
		
	}
}
