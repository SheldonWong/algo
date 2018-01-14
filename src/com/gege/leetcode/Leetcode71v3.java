package com.gege.leetcode;

/**
 * 自底向上，从0和1开始计算，使用循环
 * beats 1.99%
 * 去掉一个判断，n==0，beats 8.11%
 * @author sheldonwong
 *
 */
public class Leetcode71v3 {
	
	public int climbStairs(int n) {
		int res = 0;
		
		if(n == 1){
			return 1;
		}
		
		int p = 1; //0
		int q = 1; //1

		for(int i = 2 ; i <= n; i++){
			res = p + q;
			p = q;
			q = res;
		}
		
		return res;
	}
	
	public static void main(String[] args){
		int r = new Leetcode71v3().climbStairs(3);
		System.out.println(r);
	}
	
	

}
