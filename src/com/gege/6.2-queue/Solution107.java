package com.gege.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.gege.datastruct.TreeNode;

public class Solution107 {
	
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
    	List<List<Integer>> res = new LinkedList();
    	//双端队列
    	Queue<TreeNode> queue = new LinkedList();
    	
    	if(root == null)
    		return res;
    	
    	queue.offer(root);
    	while(!queue.isEmpty()){
    		//当前层的节点数
    		int levelNum = queue.size();
    		List<Integer> subList = new LinkedList();
    		//遍历当前层
    		for(int i = 0 ;i < levelNum;i++){
    			if(queue.peek().left != null) queue.offer(queue.peek().left);
    			if(queue.peek().right != null) queue.offer(queue.peek().right);
    			subList.add(queue.poll().val);
    		}
    		((LinkedList) res).push(subList);
    	}
    	return res;
    }
    
}
