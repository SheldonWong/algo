package com.gege.array;

/**
 * 15 / 15 test cases passed.Runtime: 4 ms beats 18.82 %
 * @author sheldonwong
 * 时间复杂度O(n)
 * 空间复杂度O(1)
 */
public class Leetcode209 {
	
    public int minSubArrayLen(int s, int[] nums) {
    	
    	int l = 0, r = -1;
    	int sum = 0;
    	int res = nums.length + 1;

    	while(l < nums.length){
    		//滑动窗口
    		if(r+1 < nums.length && sum < s){ //滑动窗口右边扩大
    			sum += nums[++r];
    		}else{  //滑动窗口左边缩小,sum减小
    			sum -= nums[l++];
    		}
    		
    		if(sum >= s){
    			res = Math.min(res, r-l+1);
    		}
    		
    	}
    	
    	if(res == nums.length + 1){
    		return 0;
    	}
    	
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
