package cn.woolsen.no21;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个
 * 只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小
 * 写）.（从0开始计数）
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        int l = str.length();
        int[] count = new int['z' - 'A' + 1];
        for (int i = 0; i < l; ++i) {
            ++count[str.charAt(i) - 'A'];
        }
        for (int i = 0; i < l; i++) {
            if (count[str.charAt(i) - 'A'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println((int) 'Z');
        System.out.println((int) 'z');
        System.out.println((int) 'A');
        System.out.println((int) 'a');
        System.out.println(s.FirstNotRepeatingChar("NXWtnzyoHoBhUJaPauJaAitLWNMlkKwDYbbigdMMaYfkVPhGZcrEwp"));
    }
}