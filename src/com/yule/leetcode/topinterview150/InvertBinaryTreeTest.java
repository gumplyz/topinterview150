package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class InvertBinaryTreeTest {

    @Test
    public void testInvertTree1() {
        InvertBinaryTree.TreeNode root=new InvertBinaryTree.TreeNode(4);
        root.left=new InvertBinaryTree.TreeNode(2);
        root.right=new InvertBinaryTree.TreeNode(7);
        root.left.left=new InvertBinaryTree.TreeNode(1);
        root.left.right=new InvertBinaryTree.TreeNode(3);
        root.right.left=new InvertBinaryTree.TreeNode(6);
        root.right.right=new InvertBinaryTree.TreeNode(9);

        InvertBinaryTree.TreeNode expected=new InvertBinaryTree.TreeNode(4);
        expected.left=new InvertBinaryTree.TreeNode(7);
        expected.right=new InvertBinaryTree.TreeNode(2);
        expected.left.left=new InvertBinaryTree.TreeNode(9);
        expected.left.right=new InvertBinaryTree.TreeNode(6);
        expected.right.left=new InvertBinaryTree.TreeNode(3);
        expected.right.right=new InvertBinaryTree.TreeNode(1);

        InvertBinaryTree invertBinaryTree=new InvertBinaryTree();
        assertEquals(invertBinaryTree.invertTree(root), expected);
    }

    @Test
    public void testInvertTree2() {
        InvertBinaryTree.TreeNode root=new InvertBinaryTree.TreeNode(2);
        root.left=new InvertBinaryTree.TreeNode(1);
        root.right=new InvertBinaryTree.TreeNode(3);

        InvertBinaryTree.TreeNode expected=new InvertBinaryTree.TreeNode(2);
        expected.left=new InvertBinaryTree.TreeNode(3);
        expected.right=new InvertBinaryTree.TreeNode(1);

        InvertBinaryTree invertBinaryTree=new InvertBinaryTree();
        assertEquals(invertBinaryTree.invertTree(root), expected);
    }

    @Test
    public void testInvertTree3() {
        InvertBinaryTree.TreeNode root=null;

        InvertBinaryTree.TreeNode expected=null;

        InvertBinaryTree invertBinaryTree=new InvertBinaryTree();
        assertEquals(invertBinaryTree.invertTree(root), expected);
    }
}