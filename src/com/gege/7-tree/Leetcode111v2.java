package com.gege.leetcode;

import com.gege.datastruct.TreeNode;

public class Leetcode111v2 {
	
	public int minDepth(TreeNode root){
		if(root == null) return 0;
		int leftDepth = minDepth(root.left);
		int rightDepth = minDepth(root.right);
		return (leftDepth == 0 || rightDepth == 0) ? leftDepth + rightDepth + 1 : Math.min(leftDepth, rightDepth) + 1;
	}

}
