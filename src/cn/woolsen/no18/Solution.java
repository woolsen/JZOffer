package cn.woolsen.no18;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 *
 * 二叉树的镜像定义：源二叉树
 *     	    8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	    8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 */
public class Solution {
    public void Mirror(TreeNode root) {
        solve(root);
    }

    private void solve(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        solve(root.left);
        solve(root.right);
    }
}