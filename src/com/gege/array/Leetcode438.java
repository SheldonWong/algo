package com.gege.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetcode438 {
	
	static HashMap<Character,Integer> hm = new HashMap();
	//在这两个单词当中，每一个英文字母所出现的次数都是相同的
	public boolean isAnagram(char[] cc,int l,int width,String p){
		
		int counter = p.length();
		//遍历cc[l...l+width]
		for(int i = l;i <= l+width;i++){
			if(hm.containsKey(cc[i]) && hm.get(cc[i]) > 0 ){
				hm.put(cc[i], hm.get(cc[i]) - 1);
				counter--;
			}
		}
		//
		for(int i = 0; i < p.length(); i++){
			char c = p.charAt(i);
			hm.put(c, hm.containsKey(c)?hm.get(c)+1:1);
		}
		
		if(counter == 0)
			return true;
		return false;
	}
	
	public List<Integer> findAnagrams(String s, String p) {
		//计数
		for(int i = 0; i < p.length(); i++){
			char c = p.charAt(i);
			hm.put(c, hm.containsKey(c)?hm.get(c)+1:1);
		}
		
		char[] cc = s.toCharArray();
		int width = p.length()-1;
		int l = 0;
		List<Integer> res = new ArrayList();
		
		//变位词
		while(l+width < s.length()){
			if(isAnagram(cc,l,width,p))
				res.add(l);
			
			l++;
		}
		
		return res;
	}

	public static void main(String[] args) {
		String s = "aa";
		String p = "bb";
		
//		for(int i = 0; i < p.length(); i++){
//			char c = p.charAt(i);
//			hm.put(c, hm.containsKey(c)?hm.get(c)+1:1);
//		}
//		System.out.println(new Leetcode438().isAnagram(s.toCharArray(), 0, 6, p));
		System.out.println(new Leetcode438().findAnagrams(s, p));

	}

}
