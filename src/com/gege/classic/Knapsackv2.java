package com.gege.classic;

import java.util.Arrays;

/**
 * 记忆化搜索
 * @author sheldonwong
 *
 */
public class Knapsackv2 {
	
	private int[][] memo;
	
	public int bestValue(int[] w,int[] v,int index,int C){
		
		if(C <= 0 || index < 0)
			return 0;
		
		if(memo[index][C] != -1)
			return memo[index][C];
		
		int res = bestValue(w,v,index-1,C);
		if(C > w[index]){
			res = Math.max(res,v[index]+bestValue(w,v,index-1,C-w[index]));
		}
		
		memo[index][C] = res;
		
		return res;
	}
	
	public int knapsack(int[] w,int[] v,int C){
        int n = w.length;
        if(n == 0 || C == 0)
            return 0;

        memo = new int[n][C + 1];
        //数组初始化
        Arrays.fill(memo, -1);
        return bestValue(w, v, n - 1, C);
	}

	public static void main(String[] args) {
		
	}

}
