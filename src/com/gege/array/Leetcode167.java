package com.gege.array;

import java.util.HashMap;

import com.gege.utils.ArrayUtils;

/**
 * 思路1 利用HashMap，开辟新空间
 * 因为HashMap会覆盖旧key，所以处理不了这样的测试用例[0,0,3,4]，0
 * @author sheldonwong
 * 时间复杂度O(n)
 * 空间复杂度O(n)
 * MyHashMap http://www.iteye.com/problems/19189 不覆盖的HashMap
 * Input:
[0,0,3,4]
0
Output:
[2,2]
Expected:
[1,2]
 */
public class Leetcode167 {
	class MyHashMap<T> extends HashMap  
	{  
	    @Override  
	    public Object put(Object key, Object value)  
	    {  
	        //如果已经存在key，不覆盖原有key对应的value  
	        if(!this.containsKey(key))  
	            return super.put(key, value);  
	          
	        return null;  
	    }  
	}  
	
	MyHashMap hm = new MyHashMap();
	
    public int[] twoSum(int[] numbers, int target) {
    	//将数组存储到哈希表中，键为数组中的数字，值为索引
    	for(int i = 0;i < numbers.length;i++){
    		hm.put(numbers[i], i+1);
    	}
    	
    	int[] res = new int[2];
    	//遍历数组，
    	for(int i = 0; i < numbers.length; i++){
    		if(hm.get(target-numbers[i]) != null){
    			res[0] = (Integer)hm.get(numbers[i]);
    			res[1] = (Integer)hm.get(target-numbers[i]);
    			break;
    		}
    	}
    	
    	return res;
        
    }

	public static void main(String[] args) {
		int[] tc = {2, 7, 11, 15};
		int[] tc2 = {0,0,3,4};
		int target = 0;
		int[] r = new Leetcode167().twoSum(tc2, target);
		ArrayUtils.printArray(r);
	}

}
