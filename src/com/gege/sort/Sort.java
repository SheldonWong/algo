package com.gege.sort;

import com.gege.utils.ArrayUtils;

public class Sort {
	

	public static int partition(int[] arr,int left,int right){
		int pivot = arr[left];
		int small = left;
		
		for(int i = left+1;i <= right;i++){
			if(arr[i] < pivot){
				small++;
				if(small != i){
					ArrayUtils.swap(arr,small,i);
				}				
			}
		}
		ArrayUtils.swap(arr,left,small);
		return small;
	}
	
	public static void quickSort(int[] arr,int left,int right){
		if(left < right){
			int middle = partition(arr,left,right);
			quickSort(arr,left,middle-1);
			quickSort(arr,middle+1,right);
		}
	}

	public static void main(String[] args) {
		//int[] a = {8,2,7,1,4,6,3,5};
		//生成测试用例2
		int[] a = ArrayUtils.generateRandomArray(10, 10, 30);
		quickSort(a,0,a.length-1);
		ArrayUtils.printArray(a);
	}
}
