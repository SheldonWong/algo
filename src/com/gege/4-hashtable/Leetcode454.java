package com.gege.hashtable;

import java.util.HashMap;
/**
 * 48 / 48 test cases passed. Runtime: 177 ms, beats 55.47 %
 * @author sheldonwong
 *
 */

public class Leetcode454 {
	
	HashMap<Integer, Integer> hm = new HashMap<>();
	
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
    	
        for(int i = 0; i < C.length; i++){
        	for(int j = 0; j < D.length; j++){
        		hm.put(C[i]+D[j], hm.containsKey(C[i]+D[j])?hm.get(C[i]+D[j])+1:1);
        	}
        }
        
        int res = 0;
        for(int i = 0; i < A.length; i++){
        	for(int j = 0; j < B.length; j++){
        		if(hm.containsKey(0-A[i]-B[j])){
        			res += hm.get(0-A[i]-B[j]);
        		}
        	}
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
