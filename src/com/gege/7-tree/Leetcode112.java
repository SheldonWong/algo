package com.gege.leetcode;

import com.gege.datastruct.TreeNode;

public class Leetcode112 {
	public static boolean hasPathSum(TreeNode root, int sum) {
		if(root == null)
			return false;
		if(root.val == sum && root.left == null && root.right == null)
			return true;
		//左子树或者右子树存在，就返回	
		return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		
		System.out.println(hasPathSum(root,3));
	}

}
