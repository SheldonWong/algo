package com.gege.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.gege.datastruct.TreeNode;
/**
 * 事实证明，这种想啊是错误的，该方法需要继续思考
 * Input [1,2]
 * Output [1]
 * Expected [1,2]
 * @author sheldonwong
 *
 */
public class Solution199v2 {
	
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList();
		
		Queue<TreeNode> queue = new LinkedList();
		
		if(root == null)
			return res;
		
		queue.offer(root);
		
		while(!queue.isEmpty()){
			if(queue.peek().right != null) queue.offer(queue.peek().right);
			res.add(queue.poll().val);
		}
		
		return res;
	}

}
