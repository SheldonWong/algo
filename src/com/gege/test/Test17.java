package com.gege.test;

/**
 * 问题："" 和  null
 * @author sheldonwong
 *
 */
public class Test17 {

	public static void main(String[] args) {
		String a = "";
		System.out.println(a == null);
		System.out.println("" == null);
		System.out.println(a.equals(null));

	}

}
