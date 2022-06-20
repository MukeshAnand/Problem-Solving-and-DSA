package com.interview.tree;

/**
 * http://www.careercup.com/question?id=6241652616200192
 * Test cases:
 * 0,1 or more nodes in the tree
 */
public class BinaryTreeToSortedLinkList {

    public Node toSortedLinkList(Node root){
        if(root == null){
            return null;
        }
        
        Node left = toSortedLinkList(root.left);
        Node right = toSortedLinkList(root.right);
        
        root.left = null;
        root.right = null;
        root = merge(left,root);
        return merge(root,right);
    }
    
    private Node merge(Node head1,Node head2){
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }
        if(head1.data <= head2.data){
            head1.right = merge(head1.next, head2);
            return head1;
        }else{
            head2.next = merge(head1,head2.next);
            return head2;
        }
    }
    
    private void print(Node root){
        while(root != null){
            System.out.print(root.data + " ");
            root = root.next;
        }
    }
    
    public static void main(String args[]){
        int in[] = {-6,0,15,10,3,25,2};
        int pre[] = {10,15,-6,0,25,3,2};
        
        BinaryTree bt = new BinaryTree();
        Node root = null;
        root = bt.addNode(10, root);
        root = bt.addNode(30, root);
        root = bt.addNode(25, root);
        root = bt.addNode(35, root);
        root = bt.addNode(-10, root);
        root = bt.addNode(0, root);
        root = bt.addNode(-20, root);
        root = bt.addNode(-15, root);
        root = bt.addNode(45, root);
        BinaryTreeToSortedLinkList btDLL = new BinaryTreeToSortedLinkList();
        root = btDLL.toSortedLinkList(root);
        btDLL.print(root);
    }
}