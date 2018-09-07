package com.gege.hashtable;

import java.util.HashSet;

public class Leetcode202 {
	
	//得到各个数位的拆分平方和
	public int getSingleSquare(int n){
		int sum = 0;
		int m;
		while(n != 0){
			m = n % 10;
			n = n/10;
			sum += m*m;
		}
		return sum;
	}
	
    public boolean isHappy(int n) {
        if(n == 1)
        	return true;
        HashSet<Integer> set = new HashSet();
        set.add(n);
        
        while(n != 1){
        	n = getSingleSquare(n);
        	if(!set.contains(n)){//集合中不包含
        		set.add(n);
        	}else if(n != 1 && set.contains(n)){ //集合中包含，会陷入死循环
        		return false;
        	}        	
        }
        return true;
    }

	public static void main(String[] args) {
		int n = 7;
		System.out.println(new Leetcode202().isHappy(n));
	}

}
