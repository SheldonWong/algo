package com.gege.leetcode;

import com.gege.datastruct.TreeNode;

/**
 * 判断对称树
 * @author sheldonwong
 *
 */
public class Leetcode101 {
	
	 public boolean isSymmetric(TreeNode root) {
		 if(root == null)
			 return true;
		 return symmetric(root.left,root.right);
		 
		 
	 }
	 
	 public boolean symmetric(TreeNode p,TreeNode q) {
		 if(p == null && q == null)
			 return true;
		 //两棵树都不为空
		 if(p != null && q != null && p.val == q.val)
			 return symmetric(p.left,q.right) && symmetric(p.right,q.left);
		 else
			 return false;
	 }
	 
	 
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
