package com.gege.recurrent;

import java.util.ArrayList;
import java.util.List;

import com.gege.utils.ArrayUtils;

/**
 * 全排列，例如对于1，2，3
 * 返回 123 132 213 231 312 321
 * @author sheldonwong
 *
 */

public class Perm {
	

	public static void perm(int[] arr,int p,int q){
		//递归终止条件
		if(p == q){
			ArrayUtils.printArray(arr);
		}
		//递归逻辑
		for(int i = p; i <= q; i++){
			ArrayUtils.swap(arr, p, i);
			perm(arr,p+1,q);
			ArrayUtils.swap(arr, p, i);
		}

	}

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		perm(arr,0,2);
	}

}
