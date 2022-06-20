package com.test.TestIng;

import java.util.LinkedList;

public class ReverseLinkedList {
	
	static Node head;
	
	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
		
		list.head = new Node(20);
		list.head.next = new Node(30);
		list.head.next.next = new Node(40);
		
		list.head.next.next.next = new Node(50);
		list.head.next.next.next.next = new Node(60);
		list.head.next.next.next.next.next = new Node(70);
		
		printList(head);
		
		System.out.println();
		head=reverseList(head);
		
		printList(head);
		
		
		
		
		
	}
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d){
			data=d;
			next= null;
		}
	}
	
	
	
	public static Node reverseList(Node node) {
		
		Node prev = null;
		Node curr = node;
		Node next = null;
		
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		node = prev;
		
		return node;
	}
	
	public static void printList(Node node) {
		
		while(node !=null) {
			System.out.print(node.data+ " ");
			node= node.next;
		}
	}

}
