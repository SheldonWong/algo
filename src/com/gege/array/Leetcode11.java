package com.gege.array;
/**
 * 双索引技术
 * 
 * @author sheldonwong
 *
 */
public class Leetcode11 {
	
    public int maxArea(int[] height) {
        if(height == null || height.length == 0)
            return 0;
        
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        
        while(left < right){
            int area = (right - left) * Math.min(height[left],height[right]);
            max = Math.max(max,area);
            
            //朝着面积可能变大的方向搜索
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
