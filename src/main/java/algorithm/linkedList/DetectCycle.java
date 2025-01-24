package algorithm.linkedList;

/**
 * 142.环形链表 2
 */
public class DetectCycle {

    /**
     * 时间复杂度: O(n)，
     * 快慢指针相遇前，指针走的次数小于链表长度，
     * 快慢指针相遇后，两个index指针走的次数也小于链表长度，总体为走的次数小于 2n
     * 空间复杂度: O(1)
     * @param head
     * @return
     */
    public ListNode hasCycle(ListNode head) {
        // 初始化快慢指针
        ListNode slow = head;
        ListNode fast = head;
        // 通过快指针遍历链表
        while (fast != null && fast.next != null) {
            // 慢指针走一步
            slow = slow.next;
            // 快指针走两步
            fast = fast.next.next;
            // 如果快慢指针相遇
            if (fast == slow) {
                // 初始化指针1指向头节点
                ListNode index1 = head;
                // 初始化指针2指向快指针
                ListNode index2 = fast;
                // 当指针1和指针2相遇则为入环节点
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                // 返回入环节点
                return index1;
            }
        }

        // 链表无环，返回null
        return null;
    }
}
