package com.gege.leetcode;

/**
 * 运行结果： Time Limit Exceeded
 * 51 / 69 test cases passed.
 * 
 * @author sheldonwong
 *
 */
public class Leetcode198 {
	
	//抢劫从index开始的房子
	public int tryRob(int[] nums,int index){
		
		if(index >= nums.length)
			return 0;
		
		int res = -1;
		
		for(int i = index; i < nums.length; i++)
			res = Math.max(res, nums[i] + tryRob(nums,i+2));
		
		return res;
	}
	
    public int rob(int[] nums) {
    	
    	return tryRob(nums,0);        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
