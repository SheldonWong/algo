package com.gege.recurrent;

import java.util.ArrayList;
import java.util.List;

public class Print1n {
	
	public static void print(int n){
		if(n == 0)
			return;
		System.out.print(n + ",");
		print(n-1);
	}
	
	static List l = new ArrayList();
	public static List addL(int n){
		if(n == 0)
			return l;
		l.add(n);
		System.out.println("before recurrent");
		addL(n-1);
		System.out.println("after recurrent");
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);
		System.out.println(addL(10));
	}

}
