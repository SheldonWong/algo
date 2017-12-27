package com.gege.leetcode;


import java.util.ArrayList;
import java.util.List;

import com.gege.datastruct.TreeNode;

/**
 * 二叉树后续遍历
 * @author sheldonwong
 *
 */
public class Solution145 {
	
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorderTraversal(root,res);
        return res;
    }
    
    private void postorderTraversal(TreeNode node,List list){
    	if(node != null){
    		postorderTraversal(node.left,list);
    		postorderTraversal(node.right,list);
    		list.add(node.val);
    	}
    }
}
