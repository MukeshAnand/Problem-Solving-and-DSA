package com.test.TestIng;

import java.util.Scanner;

public class ArrayToBST {
	
	public static void main(String[] args) {
		
		Scanner scr= new Scanner(System.in);
		
		String[] str = scr.nextLine().split(" ");
		
		int[] num = new int[str.length];
		
		int i=0;
		for(String s :str) {
			num[i] = Integer.parseInt(s);
			i++;
		}
		
		Node root = ArrayToBST(num,0,num.length-1);
		
		preOrder(root);
		
		
	}




public static Node ArrayToBST(int []a, int start, int end) {
	
	if(start>end) {
		return null;
	}
	
	
	int mid = (start+end)/2;
	
	
	Node n = new Node(a[mid]);
	
	n.left = ArrayToBST(a,start,mid-1);
	
	
	n.right = ArrayToBST(a,mid+1,end);
	
	return n;
	
}

public static void preOrder(Node n) {
	
	if(n == null)
		return;
	
	System.out.print(n.data+ " ");
	
	preOrder(n.left);
	
	preOrder(n.right);
}

}

class Node{
	
	int data;
	Node left,right;
	
	
	Node(int data){
		this.data = data;
		this.left =this.right=null;
	}
}