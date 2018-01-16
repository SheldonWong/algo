package com.gege.classic;
/**
 * 01背包问题：假设有n个物品，重量分别为wi，价值分别为
 * @author sheldonwong
 *
 */
public class Knapsack {
	
	
	//F(i),用[index...n-1]的物品，填充容量为C的背包能获得的最大价值
	public int bestValue(int[] w,int[] v,int index,int capacity){
		
		if(index < 0 || capacity <= 0)
			return 0;
		
		//物品index不放进来
		int res = bestValue(w,v,index-1,capacity);
		//物品放进来
		if(capacity > w[index]){
			res = Math.max(res, bestValue(w,v,index-1,capacity-w[index]));
		}
		
		return res;
	}
	
	public int knapsack(int[] w,int[] v,int capacity){
		int n = w.length;
		return bestValue(w,v,n-1,capacity);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
