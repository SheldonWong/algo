package com.gege.array;
/**
 * 对撞指针法
 * 一个指针从左边开始，一个指针从右边开始，如果左指针小于右指针，就继续遍历
 * 利用左指针右移和增大，右指针左移和减小的性质
 * 16 / 16 test cases passed.Runtime: 2 ms,beats 25.86 %
 * @author sheldonwong
 *
 */
public class Leetcode167v2 {
	
	public int[] twoSum(int[] numbers, int target) {
		int left = 0,right = numbers.length-1;
		
		int[] res = new int[2];
		
		while(left < right){
			if(numbers[left]+numbers[right]==target){
				res[0] = left+1;
				res[1] = right+1;
				break;
			}else if(numbers[left]+numbers[right] < target){
				left++;
			}else{
				right--;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		
	}

}
