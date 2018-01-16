package com.gege.leetcode;

import java.util.HashMap;

/**
 * 记忆化搜索
 * 69 / 69 test cases passed,Runtime: 4 ms,beat 0.98
 * @author sheldonwong
 *
 */
public class Leetcode198v2 {
	
	HashMap<Integer,Integer> hm = new HashMap();
	
	//抢劫从index开始的房子
	public int tryRob(int[] nums,int index){
		
		if(index >= nums.length)
			return 0;
		
		int res = -1;
		if(!hm.containsKey(index)){
			for(int i = index; i < nums.length; i++)
				res = Math.max(res, nums[i] + tryRob(nums,i+2));
				hm.put(index, res);
		}else{
			res = hm.get(index);
		}
		
		return res;
	}
	
    public int rob(int[] nums) {
    	
    	return tryRob(nums,0);        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
