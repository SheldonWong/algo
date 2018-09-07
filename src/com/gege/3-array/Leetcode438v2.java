package com.gege.array;

import java.util.ArrayList;
import java.util.List;

public class Leetcode438v2 {
	
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> res = new ArrayList();
		
	    int[] hash = new int[256]; //character hash
	    //record each character in p to hash
	    for (char c : p.toCharArray()) {
	        hash[c]++;
	    }
	    
	    int left = 0, right = 0, count = p.length();
	    while(right < s.length()){
	    	if(hash[s.charAt(right++)]-- >= 1) 
	    		count--;
	    	if (count == 0) 
	    		res.add(left);
	    	
	    	if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0) 
	    		count++;
	    	
	    }
	    
	    return res;
	}

	public static void main(String[] args) {
		String s = "aabbcc";
		String p = "bb";
		System.out.println(new Leetcode438v2().findAnagrams(s, p));

	}

}
