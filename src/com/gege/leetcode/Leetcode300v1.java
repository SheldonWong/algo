package com.gege.leetcode;

import java.util.Arrays;
import java.util.Collections;

/**
 * 动态规划
 * 24 / 24 test cases passed. 30ms, beat 35.06
 * @author sheldonwong
 *
 */
public class Leetcode300v1 {
	
	//memo[i] 表示已nums[i]结尾的最长上升子序列的长度
	int memo[];
	
    public int lengthOfLIS(int[] nums) {
    	if(nums.length == 0)
    		return 0;
    	
    	memo = new int[nums.length];
    	Arrays.fill(memo, 1);
    	
    	for(int i = 1; i < nums.length; i++){
    		for(int j = 0; j < i; j++){
    			if(nums[j] < nums[i])
    				memo[i] = Math.max(memo[i], 1+memo[j]);
    		}
    	}
    	
    	//取memo的最大值
    	int res = 1;
    	for(int i = 0; i < memo.length; i ++){
    		res = Math.max(res,memo[i]);
    	}
    	
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
