package com.gege.recurrent;

public class Print1n {
	
	public static void print(int n){
		if(n == 0)
			return;
		System.out.print(n + ",");
		print(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(10);
	}

}
