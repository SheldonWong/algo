package com.gege.leetcode;

/**
 * 递归版本，穷举、暴力搜索，遍历每一种可能的情况
 * 每种递归都存在一个与之对应的递归树
 * 27 / 50 test cases passed， Time Limit Exceeded
 * @author sheldonwong
 *
 */
public class Leetcode343 {
	
	public int integerBreak(int n) {
		int res = -1;
		
		if(n == 1)
			return 1;
		
		for(int i = 1; i < n; i++){
			
			// 子问题 及 子问题的最优解
			res = max3(res,i*(n-i),i*integerBreak(n-i));			
		}
			
			
		return res;
	}

	private int max3(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	public static void main(String[] args) {
		int r = new Leetcode343().integerBreak(10);
		System.out.println(r);
	}

}
