package com.yule.leetcode.topinterview150;

import java.util.Stack;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();
        int maxDepth = 0;
        int currentDepth = 0;
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                depthStack.push(++currentDepth);
                current = current.left;
            }
            current = stack.pop();
            currentDepth = depthStack.pop();
            maxDepth = Math.max(maxDepth, currentDepth);
            current = current.right;
        }
        return maxDepth;
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
    }

}
