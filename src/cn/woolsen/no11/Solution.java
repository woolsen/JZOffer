package cn.woolsen.no11;

/**
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution {

    public int NumberOf1(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n & 1);
            n = n >>> 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution s= new Solution();
        System.out.println(s.NumberOf1(-1));
        System.out.println(s.NumberOf1(1));
        System.out.println(s.NumberOf1(2));
        System.out.println(s.NumberOf1(3));
        System.out.println(s.NumberOf1(4));
    }
}