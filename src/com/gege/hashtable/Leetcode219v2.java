package com.gege.hashtable;

import java.util.HashSet;

/**
 * 23 / 23 test cases passed. Runtime: 15 ms,eats 78.03 %
 * @author sheldonwong
 *
 */
public class Leetcode219v2 {
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0 || nums == null || k == 0)
            return false;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
        	if(set.contains(nums[i]))
        		return true;
        	set.add(nums[i]);
        	if(set.size() == k+1){
        		set.remove(nums[i-k]);
        	}
        }
        
        return false;
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
