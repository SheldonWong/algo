package com.gege.leetcode;

import com.gege.utils.ArrayUtils;
/**
 * 21 / 21 test cases passed.Runtime: 29 ms,beat 3.71
 * @author sheldonwong
 *
 */
public class Leetcode283 {
	
	public void swap(int[] nums,int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
    public void moveZeroes(int[] nums) {
    	int n = nums.length;
        //先设置一个边界值，初始化为n-1，遇到一个0就减少1
    	int flag = n-1;
    	
    	//从后往前遍历数组，遇到0就把它往后移动，直到索引为flag
    	for(int i = n-1;i >=0; i--){
    		if(nums[i] == 0){
    			int j = i;
    			while(j < flag){
    				swap(nums,j,j+1);
    				j++;    				
    			}
    			//处理完一个0以后flag减1
        		flag--;
    		}
    		
    	}
    }

	public static void main(String[] args) {
		int[] tc = {0, 1, 0, 3, 12};
		
		new Leetcode283().moveZeroes(tc);
		
		ArrayUtils.printArray(tc);

	}

}
