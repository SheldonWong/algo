package com.gege.leetcode;
/**
 * 思路：覆盖
 * 161 / 161 test cases passed.Runtime: 14 ms，beat 32.53
 * @author sheldonwong
 *
 */
public class Leetcode26 {
	public int removeDuplicates(int[] nums) {
		
		if(nums == null || nums.length == 0)
			return 0;
		
		int k = 1;
		for(int i = 1; i < nums.length; i++){
			if(nums[i] != nums[i-1])
				nums[k++] = nums[i];
		}
		
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
