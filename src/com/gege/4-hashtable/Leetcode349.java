package com.gege.hashtable;

import java.util.HashSet;
import java.util.Iterator;
/**
 * 思路
 * 1. 将nums1添加到集合record中
 * 2. 遍历nums2，如果nums2的元素在record中存在，就将它添加到resultSet中
 * 3. 转换结果为数组，遍历resultSet，添加到数据结果中
 * 60 / 60 test cases passed.60 / 60 test cases passed.beats 28.15 % 
 * @author sheldonwong
 *
 *
 */
public class Leetcode349 {
	
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> record = new HashSet();
        for(int i = 0; i < nums1.length; i++){
        	record.add(nums1[i]);
        }
        
        HashSet<Integer> resultSet = new HashSet();
        for(int i = 0; i < nums2.length; i++){
        	if(record.contains(nums2[i])){
        		resultSet.add(nums2[i]);
        	}
        }
        
        int[] res = new int[resultSet.size()];
        int i = 0;
        //处理结果
        Iterator iter = resultSet.iterator();
        while(iter.hasNext()){
        	res[i++] = (Integer)iter.next();
        }
        
        return res;
    }
    
    public static void main(String[] args){
    	
    }

}
