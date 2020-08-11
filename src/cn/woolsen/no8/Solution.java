package cn.woolsen.no8;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class Solution {

    private final int[] temp = new int[10000];

    public Solution() {
        temp[1] = 1;
        temp[2] = 2;
    }

    public int JumpFloor(int target) {
        if (target == 0) {
            return 0;
        }
        return solve(target);
    }

    private int solve(int n) {
        if (temp[n] != 0) {
            return temp[n];
        }
        temp[n] = solve(n - 2) + solve(n - 1);
        return temp[n];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.JumpFloor(1));
        System.out.println(s.JumpFloor(2));
        System.out.println(s.JumpFloor(3));
        System.out.println(s.JumpFloor(4));
        System.out.println(s.JumpFloor(5));
    }
}