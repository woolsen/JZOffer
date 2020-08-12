package cn.woolsen.no13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数
 * 位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶
 * 数和偶数之间的相对位置不变。
 */
public class Solution {
    public void reOrderArray(int[] array) {
        int n = array.length;
        int[] odd = new int[n];
        int l_odd = 0;
        int[] even = new int[n];
        int l_even = 0;
        for (int value : array) {
            if (value % 2 == 1) {
                odd[l_odd++] = value;
            } else {
                even[l_even++] = value;
            }
        }
        int i = 0;
        int j = 0;
        while (--l_odd >= 0) {
            array[i++] = odd[j++];
        }
        j = 0;
        while (--l_even >= 0) {
            array[i++] = even[j++];
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {1, 3, 5, 7, 2, 4, 6};
        s.reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }
}