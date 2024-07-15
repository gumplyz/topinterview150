package com.yule.leetcode.topinterview150;

import java.util.Objects;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }

        TreeNode left=root.left;
        TreeNode right=root.right;
        invertTree(left);
        invertTree(right);

        root.left=right;
        root.right=left;
        return root;
    }

    /**
     * Definition for a binary tree node.
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TreeNode treeNode = (TreeNode) o;
            return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, left, right);
        }
    }

}
