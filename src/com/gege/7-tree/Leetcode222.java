package com.gege.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import com.gege.datastruct.TreeNode;

/**
 * 计算完全二叉树的节点数目
 * BFS
 * 超时，不能再一秒内解决问题
 * @author sheldonwong
 *
 */
public class Leetcode222 {
	
	    public int countNodes(TreeNode root) {
	    	//树为空，返回0
	        if(root == null){
	        	return 0;
	        }
	        //树不为空
	        Queue<TreeNode> queue = new LinkedList();
	        
	        queue.offer(root);
	        
	        int count = 0;
	        while(!queue.isEmpty()){
	        	int size = queue.size();
	        	for(int i = 0;i < size;i++){
	        		TreeNode front = queue.poll();
	        		if(front.left != null)
	        			queue.offer(front.left);
	        		if(front.right != null)
	        			queue.offer(front.right);
	        		count++;
	        	}
	        }
	        return count;
	    }

}
