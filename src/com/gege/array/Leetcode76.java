package com.gege.array;

import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;

public class Leetcode76 {
	
	static HashMap<Character,Integer> hm = new HashMap();
	
	//判断子串中是否包含串t [l...r]
	public boolean contain(char[] src,int l,int r,String t){
		HashMap<Character,Integer> tt = new HashMap();
		
		tt = (HashMap<Character, Integer>) hm.clone();
		int counter = t.length();
		
		//遍历窗口
		for(int i = l; i <= r; i++){
			if(tt.containsKey(src[i]) && tt.get(src[i]) > 0){
				counter--;
				//更新hm,src[i]--
				tt.put(src[i], tt.get(src[i])-1);
			}
		}
		
		if(counter == 0)
			return true;

		
		return false;
	}
	
    public String minWindow(String s, String t) {
    	
    	if(s.length() < t.length())
    		return "";
    	
		//计数
		for(int i = 0; i < t.length(); i++){
			char c = t.charAt(i);
			hm.put(c, hm.containsKey(c)?hm.get(c)+1:1);
		}
    	
    	int l = 0, r = 0;
    	char[] cc = new char[1000];
    	String res = new String(cc); 
    	
    	char[] src = s.toCharArray();
    	
        while(l < src.length){
        	//移动滑动窗口
        	//如果不包含，向右扩展窗口，直到包含    r++,substring 包头不包尾
        	while(!contain(src,l,r,t)){
        		if(r+1 < s.length()){
        			r++;
        		}
        		
        		//如果满足包含条件，跳出当前当前循环，处理满足包含的情况
        		if(contain(src,l,r,t))
        			break;
        		//如果右边到达边界，就缩小左边
        		if(r == s.length()-1 && l+1 < s.length())
        			l++;
        		//如果左边也到达边界，就返回结果
        		if(l == s.length()-1)
        			return res.length()==1000?"":res;
        	}
        	
        	//如果包含，左边缩小窗口，l++，直到不包含。
        	while(contain(src,l,r,t)){//否则，l++
        		//保存结果
        		if(res.length() > (r-l+1) && r < s.length()){ //更新条件
        			char[] rc = Arrays.copyOfRange(src, l, r+1);
        			res = String.valueOf(rc);
        		}
        		//缩小窗口
        		if( l+1 < s.length()){
        			l++;
        		}
        		//如果左边也到达边界，就返回结果
        		if(l == s.length()-1)
        			return res.length()==1000?"":res;
        		
        	}        	
        }
        
        if(res.length() == 1000)
        	return "";
        
        return res;
    }

	public static void main(String[] args) {
		
//		String s ="ADOBECODEBANC";
//		String t = "ABC";
		
//		String s = "bbaa";
//		String t = "aba";
		
		String s = "a";
		String t = "b";
//		char[] cc = new char[100];
//		cc[0] = 'a';
//		
//		System.out.println(String.valueOf(cc));
		//输出a
		//计数
//		for(int i = 0; i < t.length(); i++){
//			char c = t.charAt(i);
//			hm.put(c, hm.containsKey(c)?hm.get(c)+1:1);
//		}
//		System.out.println(new Leetcode76().contain(s.toCharArray(),0,0, t));
		System.out.println(new Leetcode76().minWindow(s, t));

	}

}
