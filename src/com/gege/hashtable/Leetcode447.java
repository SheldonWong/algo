package com.gege.hashtable;

import java.util.HashMap;
import java.util.Iterator;


/**
 * 思路：将到i的距离存储为一个映射表 {距离：个数}
 * 31 / 31 test cases passed. Runtime: 242 ms,beats 32.42 %
 * @author sheldonwong
 *
 */
public class Leetcode447 {
	
	public int dis(int[] pa,int[] pb){
		return (pa[0]-pb[0])*((pa[0]-pb[0]))+(pa[1]-pb[1])*((pa[1]-pb[1]));
	}
	
    public int numberOfBoomerangs(int[][] points) {

        int res =0;   
    	//任意点到i之间的距离
        for(int i = 0; i < points.length; i++){
        	HashMap<Integer, Integer> map = new HashMap<>();
        	for(int j = 0; j < points.length; j++){
        		if(i != j){
            		int d = dis(points[i],points[j]);
            		map.put(d, map.containsKey(d)?map.get(d)+1:1);
        		}
        	}
        	
            
            for(int a :map.values()){
            	res += a*(a-1);
            }
        }
        
        //遍历map
     

        

        
        return res;
    }

	public static void main(String[] args) {
		int[][] points = {{0,0},{1,0},{2,0}};
		
		System.out.println(new Leetcode447().numberOfBoomerangs(points));

	}

}
