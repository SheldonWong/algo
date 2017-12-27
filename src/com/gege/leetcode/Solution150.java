package com.gege.leetcode;

import java.util.Stack;

public class Solution150 {
	

	
    public static int evalRPN(String[] tokens) {
		Stack stack = new Stack();
		String regex = "-[0-9]+(.[0-9]+)?|[0-9]+(.[0-9]+)?";
		for(int i = 0;i < tokens.length ; i++){
			//是数字，包括负数,这里用正则表达式匹配
			if(tokens[i].matches(regex)){
				stack.push(tokens[i]);
			}else{ //是运算符
				
				Integer b = Integer.parseInt((String)stack.pop());
				Integer a = Integer.parseInt((String)stack.pop());
				Integer c = 0;
				
				if(tokens[i].charAt(0) == '+')
					c = a + b;
				if(tokens[i].charAt(0) == '-')
					c = a - b;
				if(tokens[i].charAt(0) == '*')
					c = a * b;
				if(tokens[i].charAt(0) == '/')
					c = a / b;
				stack.push(c.toString());
			}
		}
		int res = Integer.parseInt((String)stack.pop());;
		return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tc = {"3","-3","/"};
		System.out.println(evalRPN(tc));
	}

}
