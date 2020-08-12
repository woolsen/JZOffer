package cn.woolsen.no12;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *
 * 保证base和exponent不同时为0
 */
public class Solution {
    public double Power(double base, int exponent) {
        if (base == 0) {
            return 0;
        } else if (exponent == 0) {
            return 1;
        }
        return Math.pow(base, exponent);
    }
}