package cn.woolsen.no9;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Solution {

    public int JumpFloorII(int target) {
        return 1 << (target - 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.JumpFloorII(1));
        System.out.println(s.JumpFloorII(2));
        System.out.println(s.JumpFloorII(3));
        System.out.println(s.JumpFloorII(4));
        System.out.println(s.JumpFloorII(5));
        System.out.println(s.JumpFloorII(6));
    }
}