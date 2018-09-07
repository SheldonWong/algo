package com.gege.hashtable;

import java.util.HashMap;

public class TestMap {
	/**
	 * 和C++不同，访问一个不存在的键值，C++会插入默认值，而Java不会
	 * Can not find element 42
	 * null
	 * {}
	 * {44=2}
	 * @param args
	 */
	public static void main(String[] args) {
		//测试HashMap的一些特性
		HashMap<Integer,Integer> hm = new HashMap();
		
		if(!hm.containsKey(42))
			System.out.println("Can not find element 42");
		else
			System.out.println("Element 42 is in the map");
		System.out.println(hm.get(42));
		System.out.println(hm);
		
		hm.put(42, 1);
		hm.put(43, 5);
		hm.put(44, 2);
		hm.remove(42);
		System.out.println(hm);
		
		HashMap<Integer,Integer> hm2 = new HashMap();
		hm2.put(44,2);
		hm2.put(43,5);
		System.out.println(hm2);
		System.out.println(hm.equals(hm2));
		

	}

}
