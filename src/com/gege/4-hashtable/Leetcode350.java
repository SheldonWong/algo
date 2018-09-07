package com.gege.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 思路：
 * 1. 将nums1中的元素计数，用map存储{键：频数}
 * 2. 遍历nums2，如果nums2中的元素在map中存在，
 * 		在结果列表中添加该元素
 * 		在map中，将该元素对应的频数值减少1
 * 61 / 61 test cases passed.Runtime: 6 ms,beats 56.38 %
 * 
 * @author sheldonwong
 *
 */
public class Leetcode350 {
	
    public int[] intersect(int[] nums1, int[] nums2) {
        //1. nums1计数 map
    	HashMap<Integer,Integer> map = new HashMap();
    	for(int i = 0; i < nums1.length; i++){
    		map.put(nums1[i], map.containsKey(nums1[i])?map.get(nums1[i])+1:1);
    	}
    	
    	//2. 遍历nums2，如果在map中存在，就把它添加到结果中，并且map中相应的元素值--
    	List<Integer> resList = new ArrayList();
    	for(int i = 0; i < nums2.length; i++){
    		if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
    			resList.add(nums2[i]);
    			map.put(nums2[i],map.get(nums2[i])-1);
    		}
    	}
    	
    	int[] res = new int[resList.size()];
    	for(int i = 0; i < resList.size(); i++){
    		res[i] = resList.get(i);
    	}
    	
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
