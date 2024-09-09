package com.yule.leetcode.topinterview150;

import java.util.ArrayList;
import java.util.List;

public class AverageofLevelsinBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<TreeNode> candidate = new ArrayList<>();
        List<Double> result = new ArrayList<>();
        candidate.add(root);
        while (!candidate.isEmpty()) {
            List<TreeNode> next = new ArrayList<>();
            double sum = 0;
            for (TreeNode node : candidate) {
                sum += node.val;
                if (node.left != null) {
                    next.add(node.left);
                }
                if (node.right != null) {
                    next.add(node.right);
                }
            }
            result.add(sum / candidate.size());
            candidate = next;
        }
        return result;

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
