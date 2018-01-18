package com.gege.leetcode;

public class Leetcode75 {
	
    public void sortColors(int[] nums) {
        
    	int[] count = new int[3];
    	
    	//先遍历一遍数组，计数
    	for(int i = 0; i < nums.length;i++){
    		count[nums[i]]++;
    	}
    	
    	//在遍历一遍数组，赋值
    	int index = 0;
    	
    	for(int i = 0; i < count[0];i++){
    		nums[index++] = 0;
    	}
    	
    	for(int i = 0; i < count[1];i++){
    		nums[index++] = 1;
    	}
    	
    	for(int i = 0; i < count[2];i++){
    		nums[index++] = 2;
    	}
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
