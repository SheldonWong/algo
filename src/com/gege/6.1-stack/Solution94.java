package com.gege.leetcode;

import java.util.ArrayList;
import java.util.List;

import com.gege.datastruct.TreeNode;

/**
 * 二叉树中序遍历
 * @author sheldonwong
 *
 */
public class Solution94 {
	//思考：带返回值的递归函数
	//如果不想带返回值，可以通过函数操作指针来实现
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorderTraversal(root,res);
        return res;
    }
    
    private void inorderTraversal(TreeNode node,List list){
    	if(node != null){
    		inorderTraversal(node.left,list);
    		list.add(node.val);
    		inorderTraversal(node.right,list);
    	}
    }

}
