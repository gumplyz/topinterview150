package com.yule.leetcode.topinterview150;

import com.sun.source.tree.Tree;

import java.util.Stack;

public class MinimumAbsoluteDifferenceinBST {
    public int getMinimumDifference(TreeNode root) {
        return inOrder(root, new Stack<>(), Integer.MAX_VALUE);
    }

    private int inOrder(TreeNode root, Stack<TreeNode> nodes, int result){
        if(root.left==null && root.right==null){
            if(!nodes.isEmpty()) {
                result = Math.min(result, Math.abs(nodes.peek().val - root.val));
            }
            nodes.push(root);
            return result;
        }
        if(root.left!=null){
            result=Math.min(result, inOrder(root.left, nodes, result));
        }
        if(!nodes.isEmpty()) {
            result = Math.min(result, Math.abs(nodes.peek().val - root.val));
        }
        nodes.push(root);
        if(root.right!=null){
            result=Math.min(result, inOrder(root.right, nodes, result));
        }
        return result;
    }

    public int getMinimumDifference1(TreeNode root) {
        TreeNode current=root;
        TreeNode pre=null;
        Stack<TreeNode> parents=new Stack<>();
        boolean isPop=false;
        int result=Integer.MAX_VALUE;
        while(current!=null) {
            if(!isPop) {
                if (current.left == null) {
                    if (pre != null) {
                        result = Math.min(result, pre.val - current.val);
                    }
                    pre = current;
                    if (current.right != null) {
                        parents.push(current);
                        current = current.right;
                    } else {
                        current = parents.pop();
                    }
                } else {
                    parents.push(current);
                    current = current.left;
                }
            }
        }
        return result;
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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
