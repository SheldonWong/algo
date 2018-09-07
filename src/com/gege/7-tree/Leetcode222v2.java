package com.gege.leetcode;

import java.util.ArrayList;
import java.util.List;

import com.gege.datastruct.TreeNode;

/**
 * 另外一种思路：遍历二叉树
 * @author sheldonwong
 *
 */
public class Leetcode222v2 {
	
	public int countNodes(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		preorderTraversal(root,res);
		return res.size();
	}
	
	private void preorderTraversal(TreeNode node,List list){
		if(node != null){
			list.add(node.val);
			preorderTraversal(node.left,list);
			preorderTraversal(node.right,list);
		}
		
	}

}
