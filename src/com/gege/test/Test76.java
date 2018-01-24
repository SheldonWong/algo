package com.gege.test;

import java.util.Arrays;
import java.util.HashMap;

public class Test76 {

	public static void main(String[] args) {
		
//		String s = "helloworld";
//		
//		
//		System.out.println(s.substring(0,0));
//		System.out.println(s.substring(0,1));
//		System.out.println(s.substring(0,s.length()));
//		
//		HashMap<Character,Integer> hm = new HashMap();
//		hm.put('a',2);
//		System.out.println(hm.get('b'));

		char[] c = {'a','b'};
		char[] cc = Arrays.copyOfRange(c, 0, 1);
		System.out.println(String.valueOf(cc));
	}

}
