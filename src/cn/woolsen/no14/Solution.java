package cn.woolsen.no14;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (k == 0) {
            return null;
        }
        List<ListNode> l = new ArrayList<>();
        while (head != null) {
            l.add(head);
            head = head.next;
        }
        return k > l.size() ? null : l.get(l.size() - k);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println(s.FindKthToTail(n1, 1).val);
    }
}