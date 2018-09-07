package com.gege.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Leetcode127v2 {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord))
        	return 0;
		Queue<String> queue = new LinkedList();
		queue.offer(beginWord);
		wordList.add(endWord);
		wordList.remove(beginWord);
		
		int level = 1;
		while(!queue.isEmpty()){
			int size = queue.size();
			for(int i = 0;i < size;i++){
				String str = queue.poll();
				if(str.equals(endWord)) return level;
				for(String neighbor:neighbors(str,wordList)){
					queue.offer(neighbor);
				}
			}
			level++;
		}
		return 0;

	}
	
	public static List<String> neighbors(String s,List<String> wordList){
		List<String> res = new LinkedList();
		
		for(int i = 0; i < s.length(); i++){
			char[] chars = s.toCharArray();
			for(char ch = 'a'; ch <= 'z'; ch++){
				chars[i] = ch;
				String word = new String(chars);
				if(wordList.remove(word)){
					res.add(word);
				}
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		//思路1： word包含str-1个字母，且不等于str
		String s = "test";
		
		
		
		
		List<String> wordList = new ArrayList();
		wordList.add("aest");
		wordList.add("tast");
		wordList.add("teat");
		wordList.add("tesa");
		wordList.add("bsad");
		
		List<String> res = neighbors(s,wordList);
		System.out.println(res);

	}

}
