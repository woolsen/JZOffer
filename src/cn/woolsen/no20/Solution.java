package cn.woolsen.no20;

import java.util.ArrayList;
import java.util.List;

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，
 * 但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小
 * 到大的顺序的第N个丑数。
 */
public class Solution {

    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) return 0;

        int[] l = new int[index];
        l[0] = 1;
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;

        for (int i = 1; i < index; i++) {
            int pp2 = l[p2] * 2;
            int pp3 = l[p3] * 3;
            int pp5 = l[p5] * 5;
            int c = Math.min(pp2, Math.min(pp3, pp5));
            l[i] = c;
            if (c == pp2) p2++;
            if (c == pp3) p3++;
            if (c == pp5) p5++;
        }

        return l[index - 1];
    }

}