package com.interview.tree;

import java.util.ArrayList;
import java.util.List;

class SerializeDeserialize{

	  public void serialize(Node node, List<Integer> list) {
	    if (node == null) {
	      list.add(-1);
	      return;
	    }

	    list.add(node.data);
	    
	    serialize(node.left, list);
	    serialize(node.right, list);
	  }

	  int deSerializeIndex = 0;

	  public Node deSerialize(List<Integer> list) {
	    if (list.get(deSerializeIndex) == -1) {
	      deSerializeIndex++;
	      return null;
	    }

	    Node newNode = createNewNode(list.get(deSerializeIndex++));

	    newNode.left = deSerialize(list);
	    newNode.right = deSerialize(list);

	    return newNode;
	  }
	  
	  public Node createNewNode(int val) {
	    Node newNode = new Node();
	    newNode.data = val;
	    newNode.left = null;
	    newNode.right = null;
	    return newNode;
	  }
	  
	  public void printNode(Node node) {
		   if(node==null) {
			   return;
		   }
		   
		   System.out.print(node.data+ " ");
		   
		  printNode(node.left);
		  printNode(node.right);
	  }
	}

	public class SerializeAndDeserialize {

	  public static void main(String[] args) {

		  SerializeDeserialize a = new SerializeDeserialize();

	    Node root = a.createNewNode(2);
	    root.left = a.createNewNode(7);
	    root.left.left = a.createNewNode(10);
	    root.left.right = a.createNewNode(6);
	    root.right = a.createNewNode(9);
	    root.right.right = a.createNewNode(3);
	    a.printNode(root);
	    
	    System.out.println();
	    
	    List<Integer> list= new ArrayList<>();
	    a.serialize(root, list);
	    
	    root = a.deSerialize(list);
	    a.printNode(root);
	    System.out.println();
	  
	    
	  }
	}