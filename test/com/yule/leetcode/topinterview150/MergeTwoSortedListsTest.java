package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MergeTwoSortedListsTest {

    @Test
    public void testMergeTwoLists1() {
        MergeTwoSortedLists.ListNode list1=from(new int[]{1,2,4});
        MergeTwoSortedLists.ListNode list2=from(new int[]{1,3,4});
        int[] expected=new int[]{1,1,2,3,4,4};
        MergeTwoSortedLists m=new MergeTwoSortedLists();
        assertEquals(m.mergeTwoLists(list1, list2), from(expected));
    }

    @Test
    public void testMergeTwoLists2() {
        MergeTwoSortedLists.ListNode list1=from(new int[]{});
        MergeTwoSortedLists.ListNode list2=from(new int[]{});
        int[] expected=new int[]{};
        MergeTwoSortedLists m=new MergeTwoSortedLists();
        assertEquals(m.mergeTwoLists(list1, list2), from(expected));
    }

    @Test
    public void testMergeTwoLists3() {
        MergeTwoSortedLists.ListNode list1=from(new int[]{});
        MergeTwoSortedLists.ListNode list2=from(new int[]{0});
        int[] expected=new int[]{0};
        MergeTwoSortedLists m=new MergeTwoSortedLists();
        assertEquals(m.mergeTwoLists(list1, list2), from(expected));
    }

    private MergeTwoSortedLists.ListNode from(int[] ints) {
        if(ints.length==0){
            return null;
        }
        MergeTwoSortedLists.ListNode head=new MergeTwoSortedLists.ListNode(ints[0]);
        MergeTwoSortedLists.ListNode current=head;
        for (int i = 1; i < ints.length; i++) {
            current.next=new MergeTwoSortedLists.ListNode(ints[i]);
            current=current.next;
        }
        return head;
    }
}