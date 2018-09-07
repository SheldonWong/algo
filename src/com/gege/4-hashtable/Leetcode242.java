package com.gege.hashtable;

import java.util.HashMap;
/**
 * 34 / 34 test cases passed.Runtime: 42 ms.beats 15.12 %
 * @author sheldonwong
 *
 */
public class Leetcode242 {
	
	
    public boolean isAnagram(String s, String t) {
    	if(s.length() != t.length())
    		return false;
    	
        HashMap<Character,Integer> hm1 = new HashMap();
        for(int i = 0; i < s.length(); i++){
        	char c = s.charAt(i);
        	hm1.put(c,hm1.containsKey(c)?hm1.get(c)+1:1);
        }
        
        HashMap<Character,Integer> hm2 = new HashMap();
        for(int i = 0; i < t.length(); i++){
        	char c = t.charAt(i);
        	hm2.put(c,hm2.containsKey(c)?hm2.get(c)+1:1);
        }
        
        //因为哈希表的无序性，所以不用担心他们比较时，键的顺序问题
        return hm1.equals(hm2);
    }

	public static void main(String[] args) {
		

	}

}
