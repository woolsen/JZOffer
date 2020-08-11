package cn.woolsen.no10;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * 比如n=3时，2*3的矩形块有3种覆盖方法：
 */
public class Solution {


    public int RectCover(int target) {
        return solve(target);
    }

    public int solve(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        return solve(n - 1) + solve(n - 2);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.RectCover(1));
        System.out.println(s.RectCover(2));
        System.out.println(s.RectCover(3));
        System.out.println(s.RectCover(4));
        System.out.println(s.RectCover(5));
    }
}