package com.gege.leetcode;

import java.util.HashMap;

/**
 * 记忆化搜索
 * 结果：beats 2.68
 * 加了个return beats 2.82
 * @author sheldonwong
 *
 */
public class Leetcode343v2 {
	
	HashMap<Integer,Integer> hm = new HashMap();

	public int integerBreak(int n) {
		int res = -1;
		
		//终止条件这里可以是2
		if(n == 2)
			return 1;
		
		
		if(!hm.containsKey(n)){
			for(int i = 1; i < n; i++){
				res = max3(res,i*(n-i),i*integerBreak(n-i));
				hm.put(n, res);
			}
		}else{
			return res = hm.get(n);
		}

			
			
		return res;
	}

	private int max3(int a, int b, int c) {
		return Math.max(a, Math.max(b, c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
