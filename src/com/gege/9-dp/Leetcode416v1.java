package com.gege.leetcode;

import java.util.Arrays;
/**
 * 记忆化搜索
 * 104 / 104 test cases passed，58ms，beat 17.76
 * @author sheldonwong
 *
 */
public class Leetcode416v1 {
	
	//memo[index][sum]表示[0...index]是否能填充容量为C的背包
	//-1 表示未计算，0表示不可以填充，1表示可以填充
	int[][] memo;
	
	//定义状态：[0...i]是否能填充容量为C的背包
	private boolean tryPartition(int[] nums,int index, int sum){
		
		if(sum == 0){
			return true;
		}
		
		if(index < 0 || sum < 0)
			return false;
		if(memo[index][sum] != -1)
			return memo[index][sum] == 1;
		
		memo[index][sum] = (tryPartition(nums,index-1,sum) || 
				tryPartition(nums,index-1,sum-nums[index]) ) ? 1:0;
		return memo[index][sum] == 1;
		
	}
	
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
    	//先求和
    	for(int i = 0; i < n; i++){
    		sum += nums[i];
    	}
    	//如果数字和不为偶数，返回false
    	if(!(sum%2 == 0))
    		return false;
    	
    	//初始化记忆矩阵
    	memo = new int[nums.length][sum / 2 + 1];
        for(int i = 0 ; i < nums.length ; i ++)
        	Arrays.fill(memo[i], -1);
    	//递归调用
    	return tryPartition(nums,n-1,sum/2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
