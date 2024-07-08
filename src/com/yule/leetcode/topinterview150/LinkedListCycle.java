package com.yule.leetcode.topinterview150;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode cur=head;
        ListNode cur2=head.next;
        while(cur!=null||cur2!=null){
            if(cur.val==cur2.val&&cur.next!=null&&cur.next.equals(cur2.next)){
                return true;
            }
            cur=cur.next;
            if(cur2.next!=null){
                if(cur2.next.next!=null){
                    cur2=cur2.next.next;
                } else {
                    return false;
                }
            }else{
                return false;
            }
        }
        return false;
    }
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
}
