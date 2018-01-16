package com.gege.datastruct;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int x){
		val = x;
	}
	
	//根据数组构建二叉树
	public TreeNode arrayToTree(int[] a){
		TreeNode root = new TreeNode(a[0]);
		
		for(int i = 1; i < a.length; i++){
			
		}
		return root;
	}

}
