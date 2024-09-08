package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PathSumTest {

    @Test
    public void testHasPathSum1() {
        PathSum.TreeNode root=new PathSum.TreeNode(5);
        root.left=new PathSum.TreeNode(4);
        root.right=new PathSum.TreeNode(8);
        root.left.left=new PathSum.TreeNode(11);
        root.left.left.left=new PathSum.TreeNode(7);
        root.left.left.left=new PathSum.TreeNode(2);
        root.right.left=new PathSum.TreeNode(13);
        root.right.right=new PathSum.TreeNode(4);
        root.right.right.right=new PathSum.TreeNode(1);
        int targetSum=22;
        PathSum ps=new PathSum();
        assertTrue(ps.hasPathSum(root, targetSum));
    }

    @Test
    public void testHasPathSum2() {
        PathSum.TreeNode root=new PathSum.TreeNode(1);
        root.left=new PathSum.TreeNode(2);
        root.right=new PathSum.TreeNode(3);
        int targetSum=5;
        PathSum ps=new PathSum();
        assertFalse(ps.hasPathSum(root, targetSum));
    }

    @Test
    public void testHasPathSum3() {
        PathSum.TreeNode root=null;
        int targetSum=0;
        PathSum ps=new PathSum();
        assertFalse(ps.hasPathSum(root, targetSum));
    }
}