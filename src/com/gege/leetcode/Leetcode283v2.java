package com.gege.leetcode;

import java.util.ArrayList;
import java.util.List;

import com.gege.utils.ArrayUtils;

/**
 *  21 / 21 test cases passed.Runtime: 5 ms,beat 12.63
 * @author sheldonwong
 *
 */
public class Leetcode283v2 {
	
	public void moveZeroes(int[] nums) {
		int n = nums.length;
		//用来存储非0元素
		List<Integer> l = new ArrayList();
		for(int i = 0; i < n; i++){
			if(nums[i] != 0){
				l.add(nums[i]);
			}
		}
		
		//将非0元素到前面，后面的元素补0
		for(int i = 0;i < l.size();i++){
			nums[i] = l.get(i);
		}
		
		for(int j = l.size(); j < n;j++){
			nums[j] = 0;
		}
		
		
	}

	public static void main(String[] args) {
		int[] tc = {0, 1, 0, 3, 12};
		
		new Leetcode283v2().moveZeroes(tc);
		
		ArrayUtils.printArray(tc);

	}

}
