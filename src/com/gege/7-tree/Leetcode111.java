package com.gege.leetcode;

import com.gege.datastruct.TreeNode;

public class Leetcode111 {
	

	public int minDepth(TreeNode root){
		if(root == null)
			return 0;
		return getMinDepth(root);
	}
	
	public int getMinDepth(TreeNode root){
		if(root.left == null && root.right == null)
			return 0;
		int leftDepth = minDepth(root.left);
		int rightDepth = minDepth(root.right);
		return Math.min(leftDepth==0?rightDepth:leftDepth,rightDepth==0?leftDepth:rightDepth) + 1;
	}

}
