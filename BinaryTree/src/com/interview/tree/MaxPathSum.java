package com.interview.tree;

import java.util.concurrent.atomic.AtomicInteger;

class Tree
{
    int answer=Integer.MIN_VALUE;
    
    int maxPathSum(Node root){
        
        answer = Integer.MIN_VALUE;
        
       pathSum(root);
       
       return answer;
        
    }
    
    int pathSum(Node root)
    { 
        
        if(root==null){
            return 0;
        }
        
        int x= maxPathSum(root.left);
        int y= maxPathSum(root.right);
        
        answer= Math.max(answer, x+y+root.data);
        
        return Math.max(0,root.data+Math.max(x,y));
        
     
        
        
    } 
}

class TreeTest
{
    
    int answer;
    
    int maxPathSum(Node root){
        
        
        
        answer = Integer.MIN_VALUE;
        
        pathSum(root);
       
        return answer;
        
    }
    
    int pathSum(Node root)
    { 
        
        if(root==null){
            return 0;
        }
        
        if(root.left==null&&root.right==null){
            return root.data;
        }
        
       int  x= pathSum(root.left);
       int  y= pathSum(root.right);
       
       
         if(root.left!=null&&root.right!=null){
             answer=Math.max(answer,x+y+root.data );
             return root.data+Math.max(x,y);
         }
         
         if(root.left==null){
             return root.data+y;
         }else{
             return root.data+x;
         }
        
     
        
    }
}

class MaxPathSum{
	
	public static void main(String args[]) {
		
		int max = Integer.MIN_VALUE;
		
		System.out.println("Math max : "+Math.max(-20, -10));
	}
}