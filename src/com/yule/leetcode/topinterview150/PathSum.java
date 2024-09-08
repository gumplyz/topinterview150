package com.yule.leetcode.topinterview150;

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        int nextTargetSum = targetSum - root.val;
        boolean hasPathSum = false;
        if (root.left != null) {
            hasPathSum = hasPathSum(root.left, nextTargetSum);
            if (hasPathSum) {
                return hasPathSum;
            }
        }
        if (root.right != null) {
            hasPathSum = hasPathSum(root.right, nextTargetSum);
            if (hasPathSum) {
                return hasPathSum;
            }
        }
        return false;
    }

    /**
     * Definition for a binary tree node.
     **/
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
