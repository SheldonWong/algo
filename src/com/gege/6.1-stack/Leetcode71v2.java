package com.gege.leetcode;

import java.util.HashMap;

/**
 * 将计算过的节点存放到HashMap中，
 * 如果再要用到这个节点的话，就直接取出来返回就是了。
 * @author sheldonwong
 *
 */
public class Leetcode71v2 {
	
	HashMap<Integer,Integer> hm = new HashMap();
	
	public int climbStairs(int n) {
        int res = 0;
        if(n == 0 || n == 1)
        	return 1;        
        //检查当前节点n有没有被计算过
        //如果当前节点没有被计算过，就计算当前节点，然后放到HashMap中
        if(!hm.containsKey(n)){
        	res += climbStairs(n-1) + climbStairs(n-2);
        	hm.put(n,res);
        }else{//否则，直接从HashMap中取出来返回就可以了
        	return hm.get(n);
        }
        
				
		return res;
    }

	public static void main(String[] args) {
		
		int r = new Leetcode71v2().climbStairs(3);
		System.out.println(r);
	}

}
