package cn.woolsen.no17;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            boolean flag = solve(root1.left, root2.left) && solve(root1.right, root2.right);
            if (flag) {
                return true;
            }
        }
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    private boolean solve(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val != root2.val) {
            return false;
        }
        return solve(root1.left, root2.left) && solve(root1.right, root2.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        TreeNode tt1 = new TreeNode(1);
//        tt1.left = t6;
//        tt1.right = t7;

        Solution s = new Solution();
        System.out.println(s.HasSubtree(t1, t2));
    }
}