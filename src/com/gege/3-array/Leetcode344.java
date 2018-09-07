package com.gege.array;
/**
 * 476 / 476 test cases passed.Runtime: 2 ms,beats 73.41 %
 * 对撞指针
 * @author sheldonwong
 *
 */
public class Leetcode344 {
	
	public void swap(char[] cc,int i, int j){
		char temp = cc[i];
		cc[i] = cc[j];
		cc[j] = temp;
	}
	
    public String reverseString(String s) {
        char[] cc = s.toCharArray();
        
        int left = 0;
        int right = s.length()-1;
        
        while(left < right){
        	swap(cc,left,right);
        	left++;
        	right--;
        }
        //这里有坑坑坑坑坑，字符数组转字符串如果直接用toString打印的是对象地址
        return String.valueOf(cc);
    }

	public static void main(String[] args) {
		
		String tc = "hello";
		String r = new Leetcode344().reverseString(tc);
		System.out.println(r);
	}

}
