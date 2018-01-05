package com.gege.leetcode;


import java.util.LinkedList;
import java.util.Map.Entry;
import javafx.util.Pair;

public class Leetcode279v2 {

    public int numSquares(int n) {
        //1. 初始化
    	LinkedList<Pair<Integer,Integer>> queue = new LinkedList();
    	queue.offer(new Pair(n,0));
    	
    	boolean[] visited = new boolean[n+1];
    	visited[n] = true;
    	
    	//当队列不为空时，循环
    	//出队一个元素    	
    	//如果num==0，返回step    	
    	//处理平方数的情况
    	while(!queue.isEmpty()){
    		Pair<Integer,Integer> front = queue.poll();
    		int num = front.getKey();
    		int step = front.getValue();
    		
    		if(num == 0){
    			return step;
    		}
    		
    		for(int i = 1; num - i*i >= 0; i++){
    			if(!visited[num-i*i]){
    				queue.offer(new Pair(num - i*i,step+1));
    				visited[num-i*i] = true;
    			}
    			
    		}

    	}
    	throw new IllegalStateException("No Solution.");
    }

}
