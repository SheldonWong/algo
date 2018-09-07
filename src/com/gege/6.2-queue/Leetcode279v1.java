package com.gege.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode279v1 {
	
	class Pair<K,V>{
		private K k;
		private V v;
		
		public Pair(K k,V v){
			this.k = k;
			this.v = v;
		}

		public K getK() {
			return k;
		}

		public void setK(K k) {
			this.k = k;
		}

		public V getV() {
			return v;
		}

		public void setV(V v) {
			this.v = v;
		}
		
		
	}
	
	public int numSquares(int n){
		Queue<Pair<Integer,Integer>> queue = new LinkedList();
		
		queue.offer(new Pair(n,0));
		
		while(!queue.isEmpty()){
			Pair<Integer,Integer> front = queue.poll();
			int num = front.getK();
			int step = front.getV();
			
			for(int i = 1; num - i*i >= 0;i++){
				queue.offer(new Pair(num-i*i,step+1));
			}
		}
		
		throw new IllegalStateException("No Solution");
	}

}
