package com.gege.leetcode;

public class Leetcode27 {
	
	 public int removeElement(int[] nums, int val) {
		 if(nums == null || nums.length == 0)
			 return 0;
		 
		 int j = 0;
		 for(int i = 0; i<nums.length; i++){
			 if(nums[i] != val)
				 nums[j++] = nums[i];
		 }
		 
		 return j;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
