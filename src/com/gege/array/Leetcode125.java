package com.gege.array;
/**
 * 476 / 476 test cases passed.Runtime: 35 ms,beats 9.87 %
 * 算法本身很简单，
 * 但是要考虑多种情况，最主要的是只考虑字母和数字
 * 数字、标点、大写、空格
 * @author sheldonwong
 *
 */
public class Leetcode125 {
	
    public boolean isPalindrome(String s) {
    	if(s == "")
    		return true;
    	//去除空格，转小写
        String s2 = s.replaceAll("\\pP","").replaceAll(" ","").toLowerCase();
        //转字符数组
        char[] cc = s2.toCharArray();
        int left = 0;
        int right = cc.length-1;
        //左右指针对撞
        while(left <= right){
        	//这里还有问题，加入只输入一个标点符号 "."
        	while(!(cc[left] >= 'a' && cc[left] <= 'z' || cc[left] >= '0' && cc[left] <= '9') && left <= right)
        		left++;
        	while(!(cc[right] >= 'a' && cc[right] <= 'z' || cc[right] >= '0' && cc[right] <= '9') && left <= right)
        		right--;
	        if(cc[left] != cc[right]){
	        	return false;
	        }
	        left++;
	        right--;
        }
        return true;
    }
    

	public static void main(String[] args) {
		//去除字符串中的标点符号
		/*
		String stri="ss&*(,  .~1如果@&(^-自己!!知道`什`么#是$苦%……Z，&那*()么一-=定——+告诉::;\"'/?.,><[]{}\\||别人什么是甜。";
        String stri2=stri.replaceAll("\\pP","");//完全清除标点  
        System.out.println(stri2); 
        */
		String tc = "`l;`` 1o1 ??;l`";
		System.out.println(new Leetcode125().isPalindrome(tc));

	}
/*	过了473/476个用例，tc = "`l;`` 1o1 ??;l`";该用例没有过
    public boolean isPalindrome(String s) {
    	if(s == "")
    		return true;
    	//去除标点符号,转小写
        String s2 = s.replaceAll("\\pP","").replaceAll(" ","").toLowerCase();
        //转字符数组
        char[] cc = s2.toCharArray();
        int left = 0;
        int right = cc.length-1;
        //左右指针对撞
        while(left <= right){
	        if(cc[left] != cc[right]){
	        	return false;
	        }
	        left++;
	        right--;
        }
        return true;
    }
*/
}
