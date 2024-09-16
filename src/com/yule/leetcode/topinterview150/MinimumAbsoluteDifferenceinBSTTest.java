package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MinimumAbsoluteDifferenceinBSTTest {

    @Test
    public void testGetMinimumDifference1() {
        MinimumAbsoluteDifferenceinBST.TreeNode root=new MinimumAbsoluteDifferenceinBST.TreeNode(4);
        root.left=new MinimumAbsoluteDifferenceinBST.TreeNode(2);
        root.right=new MinimumAbsoluteDifferenceinBST.TreeNode(6);
        root.left.left=new MinimumAbsoluteDifferenceinBST.TreeNode(1);
        root.left.right=new MinimumAbsoluteDifferenceinBST.TreeNode(3);

        MinimumAbsoluteDifferenceinBST m=new MinimumAbsoluteDifferenceinBST();
        assertEquals(m.getMinimumDifference(root), 1);
    }

    @Test
    public void testGetMinimumDifference2() {
        MinimumAbsoluteDifferenceinBST.TreeNode root=new MinimumAbsoluteDifferenceinBST.TreeNode(1);
        root.left=new MinimumAbsoluteDifferenceinBST.TreeNode(0);
        root.right=new MinimumAbsoluteDifferenceinBST.TreeNode(48);
        root.right.left=new MinimumAbsoluteDifferenceinBST.TreeNode(12);
        root.right.right=new MinimumAbsoluteDifferenceinBST.TreeNode(49);

        MinimumAbsoluteDifferenceinBST m=new MinimumAbsoluteDifferenceinBST();
        assertEquals(m.getMinimumDifference(root), 1);
    }

    @Test
    public void testGetMinimumDifference3() {
        MinimumAbsoluteDifferenceinBST.TreeNode root=new MinimumAbsoluteDifferenceinBST.TreeNode(1);
        root.left=null;
        root.right=new MinimumAbsoluteDifferenceinBST.TreeNode(3);
        root.right.left=new MinimumAbsoluteDifferenceinBST.TreeNode(2);

        MinimumAbsoluteDifferenceinBST m=new MinimumAbsoluteDifferenceinBST();
        assertEquals(m.getMinimumDifference(root), 1);
    }
}