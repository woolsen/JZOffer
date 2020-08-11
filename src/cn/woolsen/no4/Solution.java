package cn.woolsen.no4;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序
 * 遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序
 * 列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Solution {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return solve(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode solve(
            int[] pre, int pre_from, int pre_to,
            int[] in, int in_from, int in_to) {
        int root = pre[pre_from];
        TreeNode t = new TreeNode(root);
        if (pre_from == pre_to) {
            return t;
        }

        int index = find(in, in_from, in_to, root);
        int left_l = index - in_from;
        int right_l = in_to - index;

        if (left_l > 0) {
            t.left = solve(pre, pre_from + 1, pre_from + left_l,
                    in, in_from, index - 1);
        }
        if (right_l > 0) {
            t.right = solve(pre, pre_from + left_l + 1, pre_to,
                    in, index + 1, in_to);
        }
        return t;
    }

    private int find(int[] a, int from, int to, int num) {
        for (int i = from; i <= to; i++) {
            if (a[i] == num) {
                return i;
            }
        }
        return -1;
    }

    private static final Solution s = new Solution();

    public static void main(String[] args) {
        int[] pre = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = new int[]{4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode t = s.reConstructBinaryTree(pre, in);
        System.out.println(t);
    }
}
