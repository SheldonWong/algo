package com.gege.leetcode;
/**
 * 思路是把非零优元素填充到前面，然后在后面填充0
 * 不开辟新空间
 * 21 / 21 test cases passed.Runtime: 2 ms,beat 80.62
 * 直接覆盖前面的空间即可
 * @author sheldonwong
 *
 */
public class Leetcode283v3 {
	
	public void moveZeroes(int[] nums) {
		int k = 0;
		for(int i = 0; i < nums.length;i++){
			if(nums[i] != 0)
				nums[k++] = nums[i];
		}
		
		//填充0
		for(int j = k; j < nums.length;j++){
			nums[j] = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
