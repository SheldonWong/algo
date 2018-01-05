package com.gege.leetcode;

import com.gege.datastruct.TreeNode;

public class Leetcode226 {
	
	public static TreeNode invertTree(TreeNode root) {
		if(root == null)
			return null;
		invertTree(root.left);
		invertTree(root.right);
		swap(root.left,root.right);
		
		return root;
	}
	
	public static void swap(TreeNode first,TreeNode second){
		TreeNode temp = first;
		first = second;
		second = temp;
	}
	
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right =new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
	}

}
