package com.yule.leetcode.topinterview150;

import java.util.Objects;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode result = list1;
        ListNode currentToMerge = list2;
        ListNode previous = null;
        ListNode currentToCompare = list1;

        while (currentToMerge != null) {
            if (currentToMerge.val < currentToCompare.val) {
                if (previous == null) {
                    ListNode temp = currentToMerge;
                    currentToMerge = currentToMerge.next;
                    temp.next = currentToCompare;
                    result = temp;
                    currentToCompare = result;
                } else {
                    ListNode temp = currentToMerge;
                    currentToMerge = currentToMerge.next;
                    temp.next = currentToCompare;
                    previous.next = temp;
                    currentToCompare = previous.next;
                }
            } else {
                previous = currentToCompare;
                currentToCompare = currentToCompare.next;
            }

            if (currentToCompare == null) {
                previous.next = currentToMerge;
                break;
            }
        }
        return result;
    }

    /**
     * Definition for singly-linked list.
     */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val && Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

}
