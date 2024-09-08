package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SymmetricTreeTest {

    @Test
    public void testIsSymmetric1() {
        SymmetricTree.TreeNode root=new SymmetricTree.TreeNode(1);
        root.left=new SymmetricTree.TreeNode(2);
        root.right=new SymmetricTree.TreeNode(2);
        root.left.left=new SymmetricTree.TreeNode(3);
        root.left.right=new SymmetricTree.TreeNode(4);
        root.right.left=new SymmetricTree.TreeNode(4);
        root.right.right=new SymmetricTree.TreeNode(3);

        SymmetricTree st=new SymmetricTree();
        assertTrue(st.isSymmetric(root));
    }

    @Test
    public void testIsSymmetric2() {
        SymmetricTree.TreeNode root=new SymmetricTree.TreeNode(1);
        root.left=new SymmetricTree.TreeNode(2);
        root.right=new SymmetricTree.TreeNode(2);
        root.left.right=new SymmetricTree.TreeNode(3);
        root.right.right=new SymmetricTree.TreeNode(3);

        SymmetricTree st=new SymmetricTree();
        assertFalse(st.isSymmetric(root));
    }
}