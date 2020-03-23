package cn.lhc.list;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfTheLinkedList {


    public ListNode middleNode(ListNode head) {
        int total = 1;
        ListNode cur = head;
        while (cur.next != null) {
            total++;
            cur = cur.next;
        }
        ListNode result = head;
        for (int i = 0; i < total / 2; i++) {
            result = result.next;
        }
        return result;
    }


}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        List list = new ArrayList();
        list.add(val);
        ListNode cur = this.next;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        return list.toString();
    }
}
