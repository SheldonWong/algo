package com.gege.array;

import java.util.HashSet;

/**
 * 481 / 481 test cases passed.Runtime: 11 ms,beats 55.80 %
 * @author sheldonwong
 *
 */
public class Leetcode345 {
	
	String  a = "aeiouAEIOU";
	
	public void swap(char[] cc,int i, int j){
		char temp = cc[i];
		cc[i] = cc[j];
		cc[j] = temp;
	}
	
    public String reverseVowels(String s) {
    	
    	char[] cc = s.toCharArray();
        
    	int left = 0;
    	int right = cc.length-1;
    	
    	while(left < right){
    		//左遍历到元音字母
    		while(!a.contains(String.valueOf(cc[left])) && left < right)
    			left++;
    		//右遍历到元音字母
    		while(!a.contains(String.valueOf(cc[right]))&& left < right)
    			right--;
    		//交换
    		swap(cc,left,right);
    		
    		left++;
    		right--;
    	}
    	
    	return String.valueOf(cc);
    }


	public static void main(String[] args) {

	}

}
