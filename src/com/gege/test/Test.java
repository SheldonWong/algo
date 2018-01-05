package com.gege.test;

import java.util.ArrayList;
import java.util.List;
/**
 * 找出wordList中和字符串s相邻的字符串，邻居串的定义：字符串a和字符串b长度相等，且只有一个位置字母不同
 * 例如：
 * test 和 aest是邻居串
 * test 和 tast是邻居串
 * 思路1：将字符串s和wordList中的每个字符串逐一比较，如果不同的字符只有一个，那么将当前字符添加到结果集中
 * 此方法时间复杂度，假设字符串长度为m，wordList长度为n，m * n
 * 思路2：将字符串s的每一位依次替换成a-z，然后判断替换后的字符是否存在于wordList中，存在则添加到结果集中 
 * 此方法的时间复杂度，k * m，k = 26
 * @author sheldonwong
 *
 */
public class Test {

	public static void main(String[] args) {
		//判断近邻，差一个字母
		
		//思路1： word包含str-1个字母，且不等于str
		String s = "test";
		
		s.equals("tes");
		List<String> wordList = new ArrayList();
		wordList.add("aest");
		wordList.add("tast");
		wordList.add("teat");
		wordList.add("tesa");
		wordList.add("bsad");
		
		
		
		List<String> res = new ArrayList();
		for(String word : wordList){
			int differNum = 0;
			for(int i = 0;i < s.length();i++){
				if(s.charAt(i) != word.charAt(i))
					differNum++;
			}
			if(differNum == 1){
				res.add(word);
			}
		}
		
		
		for(String e : res)
			System.out.println(e);

	}

}
