package com.gege.leetcode;

public class Leetcode80v2 {
	
	public int removeDuplicates(int[] nums) {
		int i = 0;
		for(int n : nums){
			//1 1 1 2 2 3
			// n = 1, i = 0 	i < 2  			执行：nums[0++] = 1  i = 1 
			// n = 1, i = 1 	i < 2    		执行：nums[1++] = 1  i = 2 
			// n = 1, i = 2 i-2=0 1 = nums[0]=1	pass 不满足条件，继续遍历
			// n = 2, i = 2 i-2=0 2 > nums[0]=1	执行：nums[2++] = 2  i = 3
			// n = 2, i = 3 i-2=1 2 > nums[1]=1  执行：nums[3++] = 2  i = 4
			// n = 3, i = 4 i-2=2 3 > nums[2]=2  执行：nums[4++] = 3  i = 5
			if(i < 2 || n > nums[i-2])
				nums[i++] = n;
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
