package com.gege.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode127 {
	
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
        	for(int i = 0; i < size; i++){
        		String front = queue.poll();
            	if(front.equals(endWord)) return level;
            	List<String> list = neighbors(front,wordList);
            	
            	for(String e:list){
            		
            		queue.offer(e);
            		wordList.remove(e);
            	}
        	}
        	
        	level++;
        }
        return 0;
    }
    
    //传进来一个字符串，返回它的邻居列表
    public static List<String> neighbors(String str,List<String> wordList){
		List<String> res = new ArrayList();
		for(String word : wordList){
			int differNum = 0;
			for(int i = 0;i < str.length();i++){
				if(str.charAt(i) != word.charAt(i))
					differNum++;
			}
			if(differNum == 1){
				res.add(word);
			}
		}
    	return res;
    }

	public static void main(String[] args) {
		String s = "abc";
		s.toCharArray();
		
	}

}
