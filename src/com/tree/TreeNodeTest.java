package com.tree;

class TreeNode {
    TreeNode left;
    TreeNode right;
}

public class TreeNodeTest{
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode();
        TreeNode treeNode2 = new TreeNode();
        TreeNode treeNode3 = new TreeNode();
        TreeNode treeNode4 = new TreeNode();
        treeNode1.left= treeNode2;
        treeNode1.right= treeNode3;
        treeNode2.right=treeNode4;
    }
}