package com.gege.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode77v2 {
	public List<List<Integer>> res;
	
	public List<List<Integer>> combine(int n, int k) {
		res = new ArrayList();
		
        if(n <= 0 || k <= 0 || k > n)
            return res;
		
		LinkedList<Integer> c = new LinkedList();
		generateCombinations(n,k,1,c);
		return res;
	}
	
	private void generateCombinations(int n, int k, int start, LinkedList<Integer> c){
		if(c.size() == k){
			res.add((List<Integer>)c.clone());
			return;
		}
		
		for(int i = start; i <= n; i++){
			c.addLast(i);
			generateCombinations(n,k,i+1,c);
			c.removeLast();
		}
		
		return;
	}

}
