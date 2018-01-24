package com.gege.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test451 {
	
	//测试HashMap根据key、value排序
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();  
        map.put('a',1);  
        map.put('c',3);  
        map.put('b',5);  
        map.put('f',7);  
        map.put('e',6);  
        map.put('d',8);
		List<Map.Entry<Character, Integer>> entryList = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
//		a=1
//		b=5
//		c=3
//		d=8
//		e=6
//		f=7
		System.out.println("Before sort");//排序前  
		for (int i = 0; i < entryList.size(); i++) {  
		    System.out.println(entryList.get(i));  
		} 
		
		//另一种实现方法，静态内部类
//        List<Map.Entry<String,Integer>> list=new ArrayList<>();  
//        list.addAll(map.entrySet());  
//        Test.ValueComparator vc=new ValueComparator();  
//        Collections.sort(list,vc);
		
		//默认从小到大排序,若要倒序可以交换相减的顺序  
		//若是字符串或其他自定义类之间的比较,可以使用compareTo  
		Collections.sort(entryList, new Comparator<Map.Entry<Character, Integer>>() {     
		    public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {        
		        //return (o1.getKey() - o2.getKey());//根据key排序  
		        return (o1.getValue() - o2.getValue());//根据value排序 ,从小到大 
		        //return (o1.getKey()).toString().compareTo(o2.getKey());  
		    }  
		}); 
		
		//Collections.sort(list, c);
		System.out.println("After sort");//排序  
		for (int i = 0; i < entryList.size(); i++) {  
		    System.out.println(entryList.get(i));  
		}
		
//		a=1
//		c=3
//		b=5
//		e=6
//		f=7
//		d=8
	}

}
