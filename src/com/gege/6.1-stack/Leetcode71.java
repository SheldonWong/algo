package com.gege.leetcode;

/**
 * 不带记忆的,超时 21/45
 * 到44时，超时
 * @author sheldonwong
 *
 */
public class Leetcode71 {
	
	public int climbStairs(int n) {
		int res = 0;
		
		if(n == 0 || n == 1){
			return 1;
		}
		
		res += climbStairs(n-1) + climbStairs(n-2);		
		return res;
	}

}
