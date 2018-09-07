package com.gege.linkedlist;

/**
 * 27 / 27 test cases passed. Runtime: 0 ms,beats 22.65 %
 * @author sheldonwong
 *
 */
public class Leetcode206v2 {
	
	public ListNode reverseList(ListNode head) {
    	
    	
        ListNode pre = null;
        ListNode cur = head;

        while(cur != null){
            ListNode next = cur.next;
        	//反转
        	cur.next = pre;
        	//更新
        	pre = cur;
        	cur = next;
        }
        
        return pre;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
