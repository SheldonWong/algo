package com.gege.leetcode;

import java.util.ArrayList;
import java.util.List;

import com.gege.datastruct.TreeNode;

/**
 * 二叉树先序遍历
 * @author sheldonwong
 *
 */
public class Solution144 {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		preorderTraversal(root,res);
		return res;
	}
	
	private void preorderTraversal(TreeNode node,List list){
		if(node != null){
			list.add(node.val);
			preorderTraversal(node.left,list);
			preorderTraversal(node.right,list);
		}
		
	}

}
