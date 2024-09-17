package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ConvertSortedArraytoBinarySearchTreeTest {

    @Test
    public void testSortedArrayToBST1() {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        ConvertSortedArraytoBinarySearchTree.TreeNode root = new ConvertSortedArraytoBinarySearchTree.TreeNode(0);
        root.left = new ConvertSortedArraytoBinarySearchTree.TreeNode(-3);
        root.right = new ConvertSortedArraytoBinarySearchTree.TreeNode(9);
        root.left.left = new ConvertSortedArraytoBinarySearchTree.TreeNode(-10);
        root.right.left = new ConvertSortedArraytoBinarySearchTree.TreeNode(5);
        ConvertSortedArraytoBinarySearchTree c = new ConvertSortedArraytoBinarySearchTree();
        assertEquals(c.sortedArrayToBST(nums), root);
    }

    @Test
    public void testSortedArrayToBST2() {
        int[] nums = new int[]{1,3};
        ConvertSortedArraytoBinarySearchTree.TreeNode root = new ConvertSortedArraytoBinarySearchTree.TreeNode(3);
        root.left = new ConvertSortedArraytoBinarySearchTree.TreeNode(1);
        ConvertSortedArraytoBinarySearchTree c = new ConvertSortedArraytoBinarySearchTree();
        assertEquals(c.sortedArrayToBST(nums), root);
    }

    @Test
    public void testSortedArrayToBST3() {
        int[] nums = new int[]{-1,0,1,2};
        ConvertSortedArraytoBinarySearchTree.TreeNode root = new ConvertSortedArraytoBinarySearchTree.TreeNode(1);
        root.left = new ConvertSortedArraytoBinarySearchTree.TreeNode(0);
        root.left.left = new ConvertSortedArraytoBinarySearchTree.TreeNode(-1);
        root.right = new ConvertSortedArraytoBinarySearchTree.TreeNode(2);
        ConvertSortedArraytoBinarySearchTree c = new ConvertSortedArraytoBinarySearchTree();
        assertEquals(c.sortedArrayToBST(nums), root);
    }

    @Test
    public void testSortedArrayToBST4() {
        int[] nums = new int[]{0,1,2,3,4,5,6};
        ConvertSortedArraytoBinarySearchTree.TreeNode root = new ConvertSortedArraytoBinarySearchTree.TreeNode(3);
        root.left = new ConvertSortedArraytoBinarySearchTree.TreeNode(1);
        root.right = new ConvertSortedArraytoBinarySearchTree.TreeNode(5);
        root.left.left = new ConvertSortedArraytoBinarySearchTree.TreeNode(0);
        root.left.right = new ConvertSortedArraytoBinarySearchTree.TreeNode(2);
        root.right.left = new ConvertSortedArraytoBinarySearchTree.TreeNode(4);
        root.right.right = new ConvertSortedArraytoBinarySearchTree.TreeNode(6);
        ConvertSortedArraytoBinarySearchTree c = new ConvertSortedArraytoBinarySearchTree();
        assertEquals(c.sortedArrayToBST(nums), root);
    }
}