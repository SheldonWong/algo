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
	
	//heapsort 时间复杂度，O(nlogn)，空间复杂度
	public static void heapsort(int[] arr){
		int total = arr.length - 1;
		//初始化堆，给定数组arr，构建一个堆,从第一个非叶子节点开始
		for(int i =total/2;i>=0;i--){
			heapfy(arr,i,arr.length);
		}
		
		//将堆顶元素与最后一个元素交换，重新调整堆
		for(int j = total;j>0;j--){
			ArrayUtils.swap(arr,0,j);
			heapfy(arr,0,j);
		}
	}
	
	//给定一个数组，树根索引i，调整成一个堆
	public static void heapfy(int[] arr,int root,int size){
		int lc = 2 * root;
		int rc = lc + 1;
		
		int max = root;
		if(lc < size && arr[lc] > arr[max]) max = lc;
		if(rc < size && arr[rc] > arr[max]) max = rc;
		
		if(max != root){
			ArrayUtils.swap(arr,root,max);
			heapfy(arr,max,size); //交换后，导致子树不满足堆的性质
		}
	}
	
	//归并排序
	public static void merge(int[] arr,int L,int M,int R){
		int LEFT_SIZE = M - L;
		int RIGHT_SIZE = R - M + 1;
		int[] left = new int[LEFT_SIZE];
		int[] right = new int[RIGHT_SIZE];
		
		int i,j,k;
		//1. Fill in the left sub array
		for(i = L;i<M;i++){
			left[i-L] = arr[i];
		}
		//2. Fill in the right sub array
		for(i = M;i <=R;i++){
			right[i-M] = arr[i];
		}
		//3. merge into the original array
		i = 0;j = 0;k = L;
		while(i < LEFT_SIZE && j < RIGHT_SIZE){
			if(left[i] < right[j]){
				arr[k] = left[i];
				i++;
				k++;
			}else{
				arr[k] = right[j];
				j++;
				k++;				
			}
		}
		
		while(i < LEFT_SIZE){
			arr[k] = left[i];
			k++;
			i++;
		}
		
		while(j < RIGHT_SIZE){
			arr[k] = right[j];
			k++;
			j++;
		}
	}
	
	public static void mergeSort(int[] arr,int L,int R){
		if(L == R){
			return;
		}else{
			int M = (L + R) / 2 ;
			mergeSort(arr,L,M);
			mergeSort(arr,M+1,R);
			merge(arr,L,M+1,R);
		}
	}
	

	public static void main(String[] args) {
		//int[] a = {8,2,7,1,4,6,3,5};
		//生成测试用例2
		int[] a = ArrayUtils.generateRandomArray(10, 10, 60);
		//quickSort(a,0,a.length-1);
		//insertSort(a);
		mergeSort(a,0,a.length-1);
		ArrayUtils.printArray(a);
	}
}
