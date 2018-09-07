package com.gege.leetcode;

import com.gege.utils.ArrayUtils;
/**
 * 59 / 59 test cases passed.Runtime: 6 ms beats 1.18 %
 * @author sheldonwong
 * 时间复杂度 O(m+n)
 * 空间复杂度 O(m+n)
 */
public class Leetcode88 {
	//归并排序的归并过程
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m+n];
        
        int i = 0, j = 0, k = 0;
        while(i < m && j < n){
        	if(nums1[i] < nums2[j]){
        		nums[k] = nums1[i];
        		i++;
        		k++;
        	}else{
        		nums[k] = nums2[j];
        		j++;
        		k++;
        	}        		
        }
        
        while(i < m){
        	nums[k++] = nums1[i++];
        }
        
        while(j < n){
        	nums[k++] = nums2[j++];
        }
        
        for(i = 0; i < m+n; i++){
        	nums1[i] = nums[i];
        }
    }
    
    public static void main(String[] args){
    	
    	int[] nums1 = {1,2,5,19,0,0,0};
    	int m = 4;
    	
    	int[] nums2 = {3,6,9};
    	int n = nums2.length;
    	new Leetcode88().merge(nums1, m, nums2, n);
    	
    	ArrayUtils.printArray(nums1);
    }

}
