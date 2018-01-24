package com.gege.hashtable;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 30 / 30 test cases passed. Runtime: 53 ms, beats 3.26 %
 * @author sheldonwong
 *
 */
public class Leetcode205 {
	
	public boolean isIsomorphic(String s,String t){
		
		HashSet<Character> set1 = new HashSet();
		for(int i = 0; i < s.length(); i++){
			set1.add(s.charAt(i));
		}
		
		HashSet set2 = new HashSet();
		for(int i = 0; i < t.length(); i++){
			set2.add(t.charAt(i));
		}
		if(set1.size() != set2.size())
			return false;
		
		HashMap<Character,Character> hm = new HashMap();
		
        int l = 0;
        while(l<s.length()){
        	hm.put(s.charAt(l), t.charAt(l));
        	l++;
        }
        
        StringBuffer a= new StringBuffer();
        //根据映射转换str，并和pattern比较
        for(int i = 0; i < s.length(); i++){
        	a.append(hm.get(s.charAt(i)));
        }
        
        for(int i = 0 ; i < t.length(); i++){
        	if(a.charAt(i) != t.charAt(i))
        		return false;
        }
        return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
