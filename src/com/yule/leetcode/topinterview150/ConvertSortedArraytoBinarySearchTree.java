package com.yule.leetcode.topinterview150;

import java.util.Objects;

public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length-1);
    }

    private TreeNode toBST(int[] nums, int curIdx, int maxIdx){
        int curLen=maxIdx-curIdx+1;
        if(curLen==1){
            return new TreeNode(nums[curIdx]);
        }
        TreeNode root=new TreeNode(nums[curIdx+curLen/2]);
        root.left=toBST(nums, curIdx, curIdx+curLen/2-1);
        if((curIdx+curLen/2+1)<=maxIdx) {
            root.right = toBST(nums, curIdx + curLen / 2 + 1, maxIdx);
        }
        return root;
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
