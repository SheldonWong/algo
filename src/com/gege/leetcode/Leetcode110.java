package com.gege.leetcode;

import com.gege.datastruct.TreeNode;

/**
 * 判断平衡二叉树，任意一个节点左右两课子树高度差不超过1
 * @author sheldonwong
 *
 */

public class Leetcode110 {
	
	public int height(TreeNode root){
		if(root == null)
			return 0;
		return  Math.max(height(root.left), height(root.right)) + 1;
	}
	
    public boolean isBalanced(TreeNode root) {
        //如果当前节点为空
    	if(root == null)
    		return true;
    	//判断当前节点的左右子树是否相差不超过1
    	//这里为什么不能分开写？
    	/**
    	 * if(Math.abs(height(root.left) - height(root.right)) <= 1) return true;
    	 * return isBalanced(root.left) && isBalanced(root.right);
    	 */
    	return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

}
