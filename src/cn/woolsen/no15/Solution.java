package cn.woolsen.no15;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode n = head;
        ListNode reverseNode = null;
        while (n != null) {
            ListNode l = reverseNode;
            reverseNode = new ListNode(n.val);
            reverseNode.next = l;
            n = n.next;
        }
        return reverseNode;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        System.out.println(s.ReverseList(n1).val);
    }
}