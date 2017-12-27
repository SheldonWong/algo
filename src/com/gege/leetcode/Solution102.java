package com.gege.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.gege.datastruct.TreeNode;

/**
 * 层次遍历二叉树
 * @author sheldonwong
 *
 */
public class Solution102 {
	
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        List<List<Integer>> wrapperList = new ArrayList<>();
        
        if(root == null)
        	return null;
        queue.offer(root);
        
        while(!queue.isEmpty()){
        	//当前层节点数目
        	int levelNum = queue.size();
        	List<Integer> subList = new ArrayList<>();
        	//从左到右遍历当前层，将当前层元素的子节点入队，将当前层元素出队
        	for(int i = 0;i < levelNum;i++){
        		if(queue.peek().left != null) queue.offer(queue.peek().left);
        		if(queue.peek().right != null) queue.offer(queue.peek().right);
        		subList.add(queue.poll().val);
        	}
        	
        	wrapperList.add(subList);
        }
        
        return wrapperList;
        	
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
