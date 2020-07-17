package cn.lhc.sort;

/**
 * 147. 对链表进行插入排序
 * https://leetcode-cn.com/problems/insertion-sort-list/
 */
public class Q147 {


    /**
     * @param head
     * @return
     */
    public ListNode insertionSortList(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode result = new ListNode(0);
        result.next = head;
        head = head.next;
        result.next.next = null;
        ListNode cur;
        while (head != null) {
            cur = head;
            head = head.next;
            insert(result, cur);
        }
        return result.next;
    }

    private void insert(ListNode head, ListNode node) {
        ListNode pre = head;
        head = head.next;
        while (head.val < node.val) {
            pre = head;
            head = head.next;
            if (null == head) {
                pre.next = node;
                node.next = null;
                return;
            }
        }
        pre.next = node;
        node.next = head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode cur = head;
        for (int i : new int[]{2, 1, 3}) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        System.out.println(new Q147().insertionSortList(head));
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
        StringBuffer buffer = new StringBuffer();
        buffer.append(val);
        ListNode ne = next;
        while (ne != null) {
            buffer.append("->").append(ne.val);
            ne = ne.next;
        }
        return buffer.toString();
    }
}

