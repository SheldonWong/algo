package com.gege.leetcode;
/**
 * 循环版本,自底向上
 * mem[i] = max(mem[i],nums[j]+mem[j+2]) 考虑j越界的情况
 * 时间复杂度 O(n^2)
 * @author sheldonwong
 *
 */
public class Leetcode198v3 {
	
	public int rob(int[] nums) {
		int n = nums.length;
		
		if(n==0)
			return 0;
		
		int[] mem = new int[nums.length];
		//mem[i]表示抢劫从[i...n-1]能获得的最大收益
		mem[n-1] = nums[n-1];
		
		for(int i = n-2; i >= 0; i--){
			//mem[i] 	
			for(int j = i; j < n; j++){
				mem[i] = Math.max(mem[i], nums[j] + (j+2<n?mem[j+2]:0));
			}
		} 
		
		return mem[0];
	}

	public static void main(String[] args) {
		

	}

}
