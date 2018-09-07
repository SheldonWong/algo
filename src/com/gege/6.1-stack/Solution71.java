package com.gege.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import com.gege.utils.FileUtils;

public class Solution71 {
	
	public static String simplifyPath(String path) {
		String[] a = path.split("/");
		Set skip = new HashSet(Arrays.asList("..",".",""));
		Stack<String> stack = new Stack<String>();
				
		
		for(int i = 0;i <a.length; i++){
			if(a[i].equals("..") && !stack.isEmpty())
				stack.pop();
			else if(!skip.contains(a[i]))
				stack.push(a[i]);
				
		}
		
//	    String res = "";
//	    for (String dir : stack) res = "/" + dir + res;
//	    return res.isEmpty() ? "/" : res;
		
		
		StringBuffer sb = new StringBuffer();
		//遍历这个栈，构造返回值
		while(!stack.isEmpty()){
			sb = sb.append("/" + stack.pop());
		}
		
		return sb.toString().isEmpty()?"/":sb.toString();
    }

	public static void main(String[] args) {
		// "/" 0  
		// "/." 2 
		// "/home/" 2 
		// "/..."
		// "/a/./b/../../c/"
		
		//搞一个文件，文件的一行代表一个测试用例
		List<String> tc = FileUtils.readLine("./Test/test71.txt");
		List<String> ans = FileUtils.readLine("./Test/ans71.txt");
		
		int i = 0;
		for(String path : tc){
			//调用方法
			String res = simplifyPath(path);
			if(!res.equals(ans.get(i))){
				System.out.println("Wrong Answer:");
				System.out.println("Input:"+path);
				System.out.println("Your Answer:"+res);
				System.out.println("Expected:"+ans.get(i));
				break;
			}
			i++;
		}

		System.out.println("Accepted!");

	}

}
