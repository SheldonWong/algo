package com.gege.leetcode;

import com.gege.datastruct.TreeNode;

/**
 * 由于是完全二叉树，只有最后一层不是满的，
 * @author sheldonwong
 *
 */
public class Leetcode222v3 {
	
	int height(TreeNode root){
		return root == null ? -1 : 1 + height(root.left);
	}
	
	public int countNodes(TreeNode root) {
		int count = 0;
		int h = height(root);
		
		while(root != null){
			if(height(root.right) == h-1){
				count += 1 << h;
				root = root.right;
			}else{
				count += 1 << h-1;
				root = root.left;
			}
			h--;
		}
		return count;
	}

}
