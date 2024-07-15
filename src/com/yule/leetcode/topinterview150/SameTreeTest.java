package com.yule.leetcode.topinterview150;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SameTreeTest {

    @Test
    public void testIsSameTree1() {
        SameTree.TreeNode p=new SameTree.TreeNode(1);
        p.left=new SameTree.TreeNode(2);
        p.right=new SameTree.TreeNode(3);

        SameTree.TreeNode q=new SameTree.TreeNode(1);
        q.left=new SameTree.TreeNode(2);
        q.right=new SameTree.TreeNode(3);

        SameTree sameTree=new SameTree();
        assertTrue(sameTree.isSameTree(p, q));

    }

    @Test
    public void testIsSameTree2() {
        SameTree.TreeNode p=new SameTree.TreeNode(1);
        p.left=new SameTree.TreeNode(2);

        SameTree.TreeNode q=new SameTree.TreeNode(1);
        q.right=new SameTree.TreeNode(2);

        SameTree sameTree=new SameTree();
        assertFalse(sameTree.isSameTree(p, q));

    }

    @Test
    public void testIsSameTree3() {
        SameTree.TreeNode p=new SameTree.TreeNode(1);
        p.left=new SameTree.TreeNode(2);
        p.right=new SameTree.TreeNode(1);

        SameTree.TreeNode q=new SameTree.TreeNode(1);
        q.left=new SameTree.TreeNode(1);
        q.right=new SameTree.TreeNode(2);

        SameTree sameTree=new SameTree();
        assertFalse(sameTree.isSameTree(p, q));

    }
}