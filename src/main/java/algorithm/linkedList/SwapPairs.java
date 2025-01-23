package algorithm.linkedList;

/**
 * 24.两两交换链表中的节点
 */
public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            ListNode temp1 = cur.next; // 保存节点一
            ListNode temp3 = cur.next.next.next; // 保存节点三
            cur.next = cur.next.next;
            cur.next.next = temp1;
            cur.next.next.next = temp3;
            cur = cur.next.next;
        }
        return dummy.next;
    }
}
