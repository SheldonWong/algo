package com.gege.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import javafx.util.Pair;



public class Solution347 {
    private class PairComparator implements Comparator<Pair<Integer, Integer>>{

        @Override
        public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2){
            if(p1.getKey() != p2.getKey())
                return p1.getKey() - p2.getKey();
            return p1.getValue() - p2.getValue();
        }
    }
	
    public static List<Integer> topKFrequent(int[] nums, int k) {
    	PriorityQueue<Pair<Integer,Integer>> pq = new PriorityQueue(k);

        //统计频率
        HashMap<Integer,Integer> hm = new HashMap();
        for(int i = 0 ; i < nums.length;i++){
        	if(!hm.containsKey(nums[i])){
        		hm.put(nums[i], 1);
        	}else{
        		hm.put(nums[i],hm.get(nums[i])+1);
        	}
        }
        
        //遍历
        for(Integer e : hm.keySet()){
        	int freq = hm.get(e);
        	if(pq.size() == k){
        		if(freq > pq.peek().getKey()){
        			pq.poll();
        			pq.add(new Pair(freq,e));
        		}
        	}else{
        		pq.add(new Pair(freq,e));
        	}
        }

        List<Integer> res = new ArrayList();
        while(!pq.isEmpty())
        	res.add(pq.poll().getValue());
        return res;
    }

	public static void main(String[] args) {
		int[] tc1 = {4,1,-1,2,-1,2,3};
		int k =	2;
		List<Integer> res = topKFrequent(tc1,k);
		System.out.println(res);
	}

}
