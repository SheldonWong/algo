package com.gege.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode17 {
	static String[] letterMap = {
		" ",
		"",
		"abc",
		"def",
		"ghi",
		"jkl",
		"mno",
		"pqrs",
		"tuv",
		"wxyz"
	};
	
	static List<String> res = new ArrayList();
	
	//s中保存了此时从digits[0...index-1]翻译得到的字母字符串
	//寻找和digits[index]匹配的字母，获得digits[0...index]的解
    public static void findLetterCombinations(String digits,int index, String s) {
        
    	if(index == digits.length()){
    		res.add(s);
    		return;
    	}
    		
    	
    	char c = digits.charAt(index);
    	String letters = letterMap[c-'0'];
    	
    	for(int i = 0; i < letters.length(); i++){
    		findLetterCombinations(digits,index+1,s+letters.charAt(i));
    	}
    	
    	return;
    }
	
	
    public static List<String> letterCombinations(String digits) {
        if(digits.equals("") || digits == null)
            return res;
    	findLetterCombinations(digits,0,"");
    	return res;
    }
    
    public static void main(String[] args){
    	String digits = "2";
    	List<String> res = letterCombinations(digits);
    	System.out.print(res.size());
    }

}
