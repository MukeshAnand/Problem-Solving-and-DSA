package com.interview.tree;

class IsMirrorTree
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
       return isSame(root,root);
    }
    
    public static boolean isSame(Node root1, Node root2){
        
        if(root1==null&&root2==null){
            return true;
        }
        
        if(root1==null||root2==null){
            return false;
        }
        
        return root1.data==root2.data&&isSame(root1.left,root2.right)&&isSame(root1.right,root2.left);
    }
        
    }
