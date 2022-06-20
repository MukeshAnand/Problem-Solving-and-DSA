package com.interview.tree;

import java.util.LinkedList;
import java.util.Queue;

class ConnectNodeUsingQueue {

	  public void connectNodeLevelSuccessor(Node node) {
	    Node previousNode = null;

	    Queue<Node> q = new LinkedList<>();
	    q.add(node);

	    while (!q.isEmpty()) {
	      int size = q.size();

	      while (size > 0) {
	        node = q.remove();

	        if (previousNode != null) {
	          previousNode.next = node;
	        }

	        previousNode = node;

	        if (node.left != null) {
	          q.add(node.left);
	        }

	        if (node.right != null) {
	          q.add(node.right);
	        }
	        size--;
	      }
	    }
	  }

	  public Node createNewNode(int val) {
	    Node newNode = new Node();
	    newNode.data = val;
	    newNode.left = null;
	    newNode.next = null;
	    newNode.right = null;
	    return newNode;
	  }
	  
	    public static void connectNode(Node root)
        {
        // initialize queue to hold nodes at same level  
        Queue<Node> q = new LinkedList<>(); 
  
        q.add(root); // adding nodes to tehe queue 
  
        Node temp = null; // initializing prev to null 
        while (!q.isEmpty()) { 
            int n = q.size(); 
            for (int i = 0; i < n; i++) { 
                Node prev = temp; 
                temp = q.poll(); 
  
                // i > 0 because when i is 0 prev points 
                // the last node of previous level,  
                // so we skip it 
                if (i > 0) 
                    prev.next = temp;  
  
                if (temp.left != null) 
                    q.add(temp.left); 
  
                if (temp.right != null) 
                    q.add(temp.right); 
            } 
  
            // pointing last node of the nth level to null 
            temp.next = null;  
      
        }
        }
	}

	public class ConnectNodesAtSameLevel {

	  public static void main(String[] args) {

		  ConnectNodeUsingQueue a = new ConnectNodeUsingQueue();

	    Node root = a.createNewNode(12);
	    root.left = a.createNewNode(4);
	    root.left.left = a.createNewNode(2);
	    root.left.left.left = a.createNewNode(1);
	    root.left.right = a.createNewNode(6);
	    root.left.right.right = a.createNewNode(3);
	    root.right = a.createNewNode(20);
	    root.right.right = a.createNewNode(27);
	    root.right.right.right = a.createNewNode(40);

	    a.connectNodeLevelSuccessor(root);
	  }
	}