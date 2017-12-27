package com.gege.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.gege.datastruct.TreeNode;
/**
 * 偷懒版本的二叉树右视图，原理是每次在结果中添加元素时，只添加当前层的最后一个元素
 * 这个算法时间和空间复杂度都稍高
 * @author sheldonwong
 *
 */
public class Solution199v1 {
	
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        List<Integer> wrapperList = new ArrayList<>();
        
        if(root == null)
        	return wrapperList;
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
        	
        	wrapperList.add(subList.get(subList.size()-1));
        }
        
        return wrapperList; 
    }

}
