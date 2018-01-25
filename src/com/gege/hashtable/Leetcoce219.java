package com.gege.hashtable;

import java.util.HashSet;
/**
 * 逻辑对了，但是会做大量的重复运算
 * @author sheldonwong
 *
 */
public class Leetcoce219 {
	
	
    public boolean containsDuplicate(int[] nums,int begin,int k) {
    	HashSet<Integer> set = new HashSet<>();
        for(int i = begin; i <= begin+k; i++){
        	if(set.contains(nums[i]))
        		return true;
        	set.add(nums[i]);
        }
        
        return false;
    }
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    	
        if(nums.length == 0 || nums == null || k == 0)
            return false;
        
        int l = 0;
        
        if(k >= nums.length){
        	if(containsDuplicate(nums,l,nums.length-1))
        		return true;
        	else
        		return false;
        }
        while(l + k < nums.length){
        	if(containsDuplicate(nums,l,k))
        		return true;
        	l++;
        }
        
        return false;
    }

	public static void main(String[] args) {
		     int[] nums = {1,2,1};
		     int k = 1;
		     
		     System.out.println(new Leetcoce219().containsNearbyDuplicate(nums, k));
	}

}
