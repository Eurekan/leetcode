package algorithm.linkedList;

/**
 * 203.移除元素
 */
public class RemoveElements {
    /**
     * 虚拟头节点
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
