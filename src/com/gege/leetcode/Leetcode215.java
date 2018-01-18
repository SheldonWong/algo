package com.gege.leetcode;
/**
 * 31 / 31 test cases passed.Runtime: 47 ms,beats 34.81 %
 * 第k大的元素的索引是 nums.length - 1
 * @author sheldonwong
 * 
 */
public class Leetcode215 {
	
	public void swap(int[] nums,int i,int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	public int partition(int[] arr,int left,int right){  
	    int pivot = arr[left];  
	    int small = left;  
	    for(int i = left + 1; i <= right; i++){  
	        if(arr[i] < pivot){  
	            small++;  
	            if(small != i){  
	                swap(arr,i,small);  
	            }                 
	        }  
	    }  
	    swap(arr,left,small);  
	    return small;  
	}  
	
	//递归的寻找
    public int findKthLargest(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        while (true) {
            int pos = partition(nums, left, right);
            if (pos == nums.length-k) return nums[pos];
            if (pos > nums.length-k) right = pos - 1;
            else left = pos + 1;
        }
    }
	
	
	


	public static void main(String[] args) {
		int[] tc = {3,2,1,5,6,4};
		
		int r = new Leetcode215().findKthLargest(tc, 2);
		
		System.out.println(r);
		
		
	}

}
