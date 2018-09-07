package com.gege.linkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * [1]
 * 空指针错误    next = next.next;
 * @author sheldonwong
 *
 */
public class Leetcode206 {
	
    public ListNode reverseList(ListNode head) {
    	
    	if(head == null)
    		return null;
    	
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = cur.next;
        
        while(cur != null){
        	//反转
        	cur.next = pre;
        	//更新
        	pre = cur;
        	cur = next;
        	next = next.next;
        }
        
        return pre;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
