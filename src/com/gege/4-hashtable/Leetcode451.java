package com.gege.hashtable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 35 / 35 test cases passed. Runtime: 51 ms,beats 35.91 %
 * @author sheldonwong
 *
 */
public class Leetcode451 {
	

	
    public String frequencySort(String s) {
        //1. 计数
    	HashMap<Character,Integer> hm = new HashMap();
    	for(int i = 0; i < s.length(); i++){
    		char c = s.charAt(i);
    		hm.put(c, hm.containsKey(c)?hm.get(c)+1:1);
    	}
    	//根据value排序
    	List<Map.Entry<Character, Integer>> entryList = new ArrayList<Map.Entry<Character, Integer>>(hm.entrySet()); 
    	Collections.sort(entryList, new Comparator<Map.Entry<Character, Integer>>() {     
    	    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {        
    	        //return (o1.getKey() - o2.getKey());//根据key排序  
    	        return (o2.getValue() - o1.getValue());//根据value排序  
    	        //return (o1.getKey()).toString().compareTo(o2.getKey());  
    	    }  
    	}); 
    	
    	StringBuffer sb = new StringBuffer();
    	//根据排序内容输出
    	for (int i = 0; i < entryList.size(); i++) {  
    	    Character a = entryList.get(i).getKey(); 
    	    int b = entryList.get(i).getValue(); 
    	    for(int j = 0; j < b; j++){
    	    	sb.append(a);
    	    }
    	}
    	
    	return sb.toString();
    }

	public static void main(String[] args) {
		String s = "tree";
		
		System.out.println(new Leetcode451().frequencySort(s));

	}

}
