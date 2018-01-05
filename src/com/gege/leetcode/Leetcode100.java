package com.gege.leetcode;

import com.gege.datastruct.TreeNode;

public class Leetcode100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if(p == null && q == null)
			return true;
		
		if(p != null && q != null && p.val == q.val)
			return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
