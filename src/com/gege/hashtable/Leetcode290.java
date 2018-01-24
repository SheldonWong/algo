package com.gege.hashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 *  33 / 33 test cases passed Runtime: 3 ms beats 11.60 %
 * @author sheldonwong
 *
 */
public class Leetcode290 {

    public boolean wordPattern(String pattern, String str) {
    	//取集合
        HashSet<String> set1 = new HashSet();
        String[] ss = str.split(" ");
        if(ss.length != pattern.length()){
        	return false;
        }
        for(int i = 0; i < ss.length; i++ ){
        	set1.add(ss[i]);
        }
        HashSet<Character> set2 = new HashSet();
        for(int i = 0; i < pattern.length(); i++){
        	set2.add(pattern.charAt(i));
        }
        
        //建立映射，这里如果按照上面的set建立映射的话，会产生顺序问题，所以同时循环str和pattern
        if(set1.size() != set2.size())
        	return false;
        HashMap<String,Character> hm = new HashMap();
        int l = 0;
        while(l<pattern.length()){
        	hm.put(ss[l], pattern.charAt(l));
        	l++;
        }
        
        StringBuffer a= new StringBuffer();
        //根据映射转换str，并和pattern比较
        for(int i = 0; i < ss.length; i++){
        	a.append(hm.get(ss[i]));
        }
        
        for(int i = 0 ; i < pattern.length(); i++){
        	if(a.charAt(i) != pattern.charAt(i))
        		return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
		String pattern = "abba";
		String str = "dog cat cat dog";
		System.out.println(new Leetcode290().wordPattern(pattern, str));

	}

}
