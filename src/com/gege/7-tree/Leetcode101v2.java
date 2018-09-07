package com.gege.leetcode;

import com.gege.datastruct.TreeNode;
/**
 * 原来的版本
 * @author sheldonwong
 *
 */
public class Leetcode101v2 {
    public boolean isSymmetric(TreeNode root) {
        //树为空，对称
        if(root==null)
            return true;
        return symmetric(root.left, root.right);
    }
    
    //判断两棵树是否对称
    private boolean symmetric(TreeNode left, TreeNode right){
        //left和right都为空，对称
        if(left==null && right==null)
            return true;
        //left和right只有一个为空，不对称
        if(left == null || right == null)
            return false;
        //left的值不等于right的值，不对称
        if(left.val != right.val)
            return false;
        return symmetric(left.left, right.right) && symmetric(left.right, right.left);
    }

}
