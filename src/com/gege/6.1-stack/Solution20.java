package com.gege.leetcode;

import java.util.Stack;

public class Solution20 {
	
	public static boolean isValid(String s){
		Stack stack = new Stack();
		//遍历字符串
		for(int i = 0;i<s.length(); i++){
			//如果当前元素是左括号，入栈
			if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
				stack.push(s.charAt(i));
			}else{//如果当前元素是右括号，将栈顶元素出栈，判断二者是否匹配
				
				if(stack.isEmpty())
					return false;
				char c = (char) stack.pop();
				
				char match = ' ';
				if(s.charAt(i) == ')')
					match = '(';
				if(s.charAt(i) == ']')
					match = '[';
				if(s.charAt(i) == '}')
					match = '{';
				if(match != c)
					return false;
				
			}
			

		}
		
		if(!stack.isEmpty())
			return false;
		return true;
		
		
	}

	public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("([)]"));

	}

}
