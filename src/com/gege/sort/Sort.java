package com.gege.sort;

import com.gege.utils.ArrayUtils;
/**
 * 
 * @author sheldonwong
 * 常见排序算法
 * 插入排序
 * 快排
 * 堆排
 * 归并排序
 */

public class Sort {
	
	//插入排序，插入排序比较简单，只看一下排序过程就知道了
	public static void insertSort(int[] arr){
		for(int i = 1;i < arr.length;i++){
			for(int j = i; j>0;j--){
				if(arr[j] < arr[j-1]){
					ArrayUtils.swap(arr,j,j-1);
				}else{//arr[j] > arr[j-1]，说明元素插入到了正确的位置，此时停止内循环即可
					break;
				}
			}
			
		}
	}
	

	//快排的辅助函数partition，给定一个arr，以及arr中的一个元素a，把大于a的移动到a的右边，小于a的移动到a的左边
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
	//快排，时间复杂度O(nlogn),不稳定
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
		//quickSort(a,0,a.length-1);
		insertSort(a);
		ArrayUtils.printArray(a);
	}
}
