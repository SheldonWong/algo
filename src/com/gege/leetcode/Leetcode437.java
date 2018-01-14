package com.gege.leetcode;

import com.gege.datastruct.TreeNode;

public class Leetcode437 {
	
	
    public int pathSum(TreeNode root, int sum) {
    	//如果树为空，那么路径为0条
        if(root == null)
        	return 0;
        
        //在以root为根节点的路径中，有多少和为sum
        int res = findPath(root,sum);
        
        //排除root的路径中，有多少条和为num
        res += pathSum(root.left,sum);
        res += pathSum(root.right,sum);
        
        return res;
    }
    
    //寻找以node为根节点，和为num的路径
    public int findPath(TreeNode node,int num){
    	if(node == null)
    		return 0;
    	
    	int res = 0;
    	if(node.val == num)
    		res += 1;
    	
    	res += findPath(node.left,num-node.val);
    	res += findPath(node.right,num-node.val);
    	
    	return res;
    }

}
