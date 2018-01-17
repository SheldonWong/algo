package com.gege.classic;

public class BinarySearch {
	
	//二分查找法
	public int binarySearch(int[] nums,int target){
		
		int l = 0,r = nums.length-1;
		
		while(l<=r){
			int mid = (l+r)/2;
			if(nums[mid] == target)
				return mid;
			if(target > nums[mid])
				l = mid+1;
			else
				r = mid-1;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
