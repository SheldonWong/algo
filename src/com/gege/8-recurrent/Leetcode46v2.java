package com.gege.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.gege.utils.ArrayUtils;
/**
 * 做一些简单的说明
 * 之前的基础集合用的是LinkedList,beat 14.45
 * 后来改成了ArrayList，beat 86.79
 * @author sheldonwong
 *
 */

public class Leetcode46v2 {
	
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	
	public ArrayList<Integer> arrayToList(int[] nums){
		ArrayList<Integer> t = new ArrayList();
		for(int i = 0; i < nums.length; i++){
			t.add(nums[i]);
		}
		return t;
	}
	
	public List<List<Integer>> permute(int[] nums) {
		
		ArrayList<Integer> c = arrayToList(nums);
		generatePermutation(c,0,nums.length-1);
		return res;
	}
	
	private void generatePermutation(ArrayList<Integer> c, int p, int q ){
		//递归终止条件
		if(p == q){
			//LinkedList有clone方法，List没有...,因为List是接口
			res.add((List<Integer>)c.clone());
			return;
		}
		//递归逻辑
		for(int i = p; i <= q; i++){
			Collections.swap(c,p,i);
			generatePermutation(c,p+1,q);
			Collections.swap(c, p, i);
		}
	}
	
	public static void main(String[] args){
		int[] nums = {1,2,3};
		
		List<List<Integer>> r = new Leetcode46v2().permute(nums);
		
		for(int i = 0; i < r.size(); i++){
			ArrayUtils.printList(r.get(i));
		}
		
	}

}
