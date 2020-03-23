package cn.lhc.list;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddleOfTheLinkedListTest {

    private MiddleOfTheLinkedList middleOfTheLinkedList = new MiddleOfTheLinkedList();

    @Test
    public void middleNode() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;
        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
        System.out.println(middleOfTheLinkedList.middleNode(head));

    }


}