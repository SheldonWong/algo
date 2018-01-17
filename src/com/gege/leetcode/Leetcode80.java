package com.gege.leetcode;

import com.gege.utils.ArrayUtils;
/**
 * 164 / 164 test cases passed.Runtime: 1 ms,beat 19.08
 * @author sheldonwong
 * 时间复杂度 O(n)
 * 空间复杂度 O(n)
 */
public class Leetcode80 {
	
    public int removeDuplicates(int[] nums) {
    	
    	if(nums == null || nums.length == 0)
    		return 0;
        if(nums.length == 1|| nums.length == 2){
            return nums.length;
        }
        int[] res = new int[nums.length];
        res[0] = nums[0];
        res[1] = nums[1];
        
    	int k = 2;
    	for(int i = 2; i < nums.length; i++){
    		//如果i == i-1 && i-1 != i-2 || i != i-1
    		if(nums[i] != nums[i-1] || (nums[i] == nums[i-1] && nums[i-1] != nums[i-2])){
    			res[k++] = nums[i];
    		}
    	}
    	
    	for(int i = 2;i < k;i++){
    		nums[i] = res[i];
    	}
    	return k;
    }

	public static void main(String[] args) {
		int[] tc = {1,1,1,2,2,3};
		new Leetcode80().removeDuplicates(tc);
		ArrayUtils.printArray(tc);
	}

}
