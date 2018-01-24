package com.gege.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Leetcode76v3 {

	public static void main(String[] args) {
		String s = "bbaa";
		String t = "aba";
		
		HashMap<Character,Integer> hm = new HashMap();
		//计数
		for(int i = 0; i < t.length(); i++){
			char c = t.charAt(i);
			hm.put(c, hm.containsKey(c)?hm.get(c)+1:1);
		}
		
		System.out.println(hm);
		
		int counter=t.length(), l = 0, r = 0, d = Integer.MAX_VALUE,h=0;
		while(l < s.length()){
			//遍历，直到找到一个窗口，满足包含条件
			while(counter != 0){
				if(hm.get(s.charAt(r)) > 0){
					hm.put(s.charAt(r), hm.get(s.charAt(r))-1);
					counter--;
				}
				//窗口右边扩大
				if(r+1 < s.length()){
					r++;
				}
			}
			
			
			
			while(counter==0){
				if(r-l+1<d)  d=r-(h=l) + 1;
				//窗口左边缩小
				if(l+1 < s.length()){
					l++;
				}
				if(hm.containsKey(s.charAt(l)) && hm.get(s.charAt(l))==0){
                	hm.put(s.charAt(l), hm.get(s.charAt(l))+1);
                	counter++;  //make it invalid
				}
				

				
			}
		}
		
		System.out.println("hello");
		
		System.out.println(s.substring(h,d));
		//return d==Integer.MAX_VALUE? "":s.substring(h, d);
		
		
		
//		Iterator<Entry<Character, Integer>> iterator = hm.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Entry<Character, Integer> entry = iterator.next();
//			System.out.println(entry.getKey()+entry.getValue());
//		}

	}

}
