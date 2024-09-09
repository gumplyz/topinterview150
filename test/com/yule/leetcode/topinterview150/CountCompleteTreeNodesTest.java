package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CountCompleteTreeNodesTest {

    @Test
    public void testCountNodes1() {
        CountCompleteTreeNodes.TreeNode root = new CountCompleteTreeNodes.TreeNode(1);
        root.left=new CountCompleteTreeNodes.TreeNode(2);
        root.right=new CountCompleteTreeNodes.TreeNode(3);
        root.left.left=new CountCompleteTreeNodes.TreeNode(4);
        root.left.right=new CountCompleteTreeNodes.TreeNode(5);
        root.right.left=new CountCompleteTreeNodes.TreeNode(6);

        int k=6;
        CountCompleteTreeNodes c=new CountCompleteTreeNodes();
        assertEquals(c.countNodes(root), k);
    }

    @Test
    public void testCountNodes2() {
        CountCompleteTreeNodes.TreeNode root = null;

        int k=0;
        CountCompleteTreeNodes c=new CountCompleteTreeNodes();
        assertEquals(c.countNodes(root), k);
    }


    @Test
    public void testCountNodes3() {
        CountCompleteTreeNodes.TreeNode root = new CountCompleteTreeNodes.TreeNode(1);

        int k=1;
        CountCompleteTreeNodes c=new CountCompleteTreeNodes();
        assertEquals(c.countNodes(root), k);
    }
}