package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LinkedListCycleTest {

    @Test
    public void testHasCycle1() {
        LinkedListCycle.ListNode head=from(new int[]{3, 2, 0, -4}, 1);
        LinkedListCycle linkedListCycle=new LinkedListCycle();
        assertTrue(linkedListCycle.hasCycle(head));
    }

    @Test
    public void testHasCycle2() {
        LinkedListCycle.ListNode head=from(new int[]{1,2}, 0);
        LinkedListCycle linkedListCycle=new LinkedListCycle();
        assertTrue(linkedListCycle.hasCycle(head));
    }

    @Test
    public void testHasCycle3() {
        LinkedListCycle.ListNode head=from(new int[]{1}, -1);
        LinkedListCycle linkedListCycle=new LinkedListCycle();
        assertFalse(linkedListCycle.hasCycle(head));
    }


    @Test
    public void testHasCycle4() {
        LinkedListCycle.ListNode head=from(new int[]{1,1,1,1}, -1);
        LinkedListCycle linkedListCycle=new LinkedListCycle();
        assertFalse(linkedListCycle.hasCycle(head));
    }

    private LinkedListCycle.ListNode from(int[] l, int pos){
        if(l.length==0){
            return null;
        }
        LinkedListCycle.ListNode head=new LinkedListCycle.ListNode(l[0]);
        LinkedListCycle.ListNode cycle=null;
        if(pos==0){
             cycle=head;
        }
        LinkedListCycle.ListNode cur=head;
        for (int i = 1; i < l.length; i++) {
            LinkedListCycle.ListNode n=new LinkedListCycle.ListNode(l[i]);
            if(pos==i){
                cycle=n;
            }
            cur.next=n;
            cur=n;
        }
        cur.next=cycle;
        return head;
    }

}