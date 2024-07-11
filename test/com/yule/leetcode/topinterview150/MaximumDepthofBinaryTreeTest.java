package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MaximumDepthofBinaryTreeTest {

    @Test
    public void testMaxDepth1() {
        MaximumDepthofBinaryTree.TreeNode root = new MaximumDepthofBinaryTree.TreeNode(3);
        root.left = new MaximumDepthofBinaryTree.TreeNode(9);
        root.right = new MaximumDepthofBinaryTree.TreeNode(20);
        root.right.left = new MaximumDepthofBinaryTree.TreeNode(15);
        root.right.right = new MaximumDepthofBinaryTree.TreeNode(7);
        int k=3;

        MaximumDepthofBinaryTree m=new MaximumDepthofBinaryTree();
        int actual=m.maxDepth(root);
        assertEquals(actual, k);
    }

    @Test
    public void testMaxDepth2() {
        MaximumDepthofBinaryTree.TreeNode root = new MaximumDepthofBinaryTree.TreeNode(1);
        root.right = new MaximumDepthofBinaryTree.TreeNode(2);
        int k=2;

        MaximumDepthofBinaryTree m=new MaximumDepthofBinaryTree();
        int actual=m.maxDepth(root);
        assertEquals(actual, k);
    }
}