package com.gege.array;

import java.util.HashMap;

public class Leetcode76v2 {
	
	HashMap<Character,Integer> hm = new HashMap();
	public String minWindow(String s, String t) {
		
		if (s.length()==0||t.length()==0||s.length()<t.length()) 
			return "";
		//计数
		for(int i = 0; i < t.length(); i++){
			if(!hm.containsKey(s.charAt(i))){
				hm.put(s.charAt(i), 1);
			}else{
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
		}
		
		//
		int counter=t.length(), begin=0, end=0, d=Integer.MAX_VALUE, head=0;
		
		while(end<s.length()){
            if(hm.get(s.charAt(end)) > 0) {
            	hm.put(s.charAt(end), hm.get(s.charAt(end))-1);
            	end++;
            	counter--; //in t            	
            }
            	
            while(counter==0){ //valid
                if(end-begin<d)  d=end-(head=begin);
                if(hm.get(s.charAt(begin))==0) {
                	hm.put(s.charAt(begin), hm.get(s.charAt(begin))+1);
                	begin++;
                	counter++;  //make it invalid
                }
                	
            }  
        }
		
		return d==Integer.MAX_VALUE? "":s.substring(head, d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
