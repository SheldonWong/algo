package com.gege.leetcode;

/**
 * 数学版本
 * 0ms,beat 65.30
 * @author sheldonwong
 *
 */
public class Leetcode343v4 {
	
    public int integerBreak(int n) {
        if(n <= 3)
            return n - 1;
        
        int product = 1;
        while(n > 4){
            product *= 3;
            n -= 3;
        }
        product *= n;
        return product;
        
    }

}
