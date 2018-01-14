package com.gege.utils;

import java.util.List;

public class ArrayUtils {
	//
	public static void printArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void printList(List l){
		for(int i=0;i<l.size();i++){
			System.out.print(l.get(i) + " ");
		}
		System.out.println();
	}
	
	//
	public static int[] generateRandomArray(int n,int rangeL,int rangeR){
		assert n>0 && rangeL < rangeR;
		int[] arr = new int[n];
		for(int i = 0;i < n;i++){
			arr[i] = (int)(Math.random() * (rangeR - rangeL +1) + rangeL);
		}
		return arr;
	}
	
	//
	public static int[] generateOrderedArray(int n){
		assert n > 0;
		int[] arr = new int[n];
		
		for(int i = 0; i < n;i++){
			arr[i] = i;
		}
		
		return arr;
	}
	
	//
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
