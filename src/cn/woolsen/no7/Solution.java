package cn.woolsen.no7;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n<=39
 */
public class Solution {

    private final int[] temp = new int[40];

    public Solution() {
        temp[1] = 1;
        temp[2] = 1;
    }

    public int Fibonacci(int n) {
        return solve(n);
    }

    private int solve(int n) {
        if (n == 0) {
            return 0;
        } else if (temp[n] != 0) {
            return temp[n];
        } else {
            int sum = solve(n - 1) + solve(n - 2);
            temp[n] = sum;
            return solve(n - 1) + solve(n - 2);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.Fibonacci(39));
    }
}