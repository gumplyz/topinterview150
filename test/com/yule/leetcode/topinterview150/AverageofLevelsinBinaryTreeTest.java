package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AverageofLevelsinBinaryTreeTest {

    @Test
    public void testAverageOfLevels1() {
        AverageofLevelsinBinaryTree.TreeNode root = new AverageofLevelsinBinaryTree.TreeNode(3);
        root.left=new AverageofLevelsinBinaryTree.TreeNode(9);
        root.right=new AverageofLevelsinBinaryTree.TreeNode(20);
        root.right.left=new AverageofLevelsinBinaryTree.TreeNode(15);
        root.right.right=new AverageofLevelsinBinaryTree.TreeNode(7);

        double[] k={3.0, 14.5, 11.0};
        AverageofLevelsinBinaryTree a=new AverageofLevelsinBinaryTree();
        double[] actual=a.averageOfLevels(root).stream().mapToDouble(Double::doubleValue).toArray();
        assertEquals(actual, k);
    }


    @Test
    public void testAverageOfLevels2() {
        AverageofLevelsinBinaryTree.TreeNode root = new AverageofLevelsinBinaryTree.TreeNode(3);
        root.left=new AverageofLevelsinBinaryTree.TreeNode(9);
        root.right=new AverageofLevelsinBinaryTree.TreeNode(20);
        root.left.left=new AverageofLevelsinBinaryTree.TreeNode(15);
        root.left.right=new AverageofLevelsinBinaryTree.TreeNode(7);

        double[] k={3.0, 14.5, 11.0};
        AverageofLevelsinBinaryTree a=new AverageofLevelsinBinaryTree();
        double[] actual=a.averageOfLevels(root).stream().mapToDouble(Double::doubleValue).toArray();
        assertEquals(actual, k);
    }
}