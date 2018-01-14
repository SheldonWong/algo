package com.gege.leetcode;

import com.gege.datastruct.TreeNode;

public class Leetcode235 {
	
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null)
        	return null;
        
        //如果p和q都小于root，那么递归的在左子树找
        if(p.val < root.val && q.val < root.val)
        	return lowestCommonAncestor(root.left,p,q);
        //如果p和q都大于root，那么递归的右子树找
        if(p.val > root.val && q.val > root.val)
        	return lowestCommonAncestor(root.right,p,q);
        
        return root;
        	
    }

}
