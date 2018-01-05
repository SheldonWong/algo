package com.gege.leetcode;

import com.gege.datastruct.TreeNode;

/**
 * 求二叉树的最大深度
 * @author sheldonwong
 *
 */
public class Leetcode104 {
	
	public int maxDepth(TreeNode root){
		if(root == null)
			return 0;
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		return Math.max(leftDepth,rightDepth) + 1;
	}

}
