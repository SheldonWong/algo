package com.gege.hashtable;

import java.util.HashSet;
/**
 * 18 / 18 test cases passed. Runtime: 21 ms,beats 26.37 %
 * @author sheldonwong
 *
 */
public class Leetcode217 {
	
	HashSet<Integer> set = new HashSet<>();
    public boolean containsDuplicate(int[] nums) {
    	
        for(int i = 0; i < nums.length; i++){
        	if(set.contains(nums[i]))
        		return true;
        	set.add(nums[i]);
        }
        
        return false;
    }

	public static void main(String[] args) {

	}

}
