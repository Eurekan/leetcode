package algorithm.linkedList;

/**
 * 面试题 02.07 链表相交
 */
public class GetIntersectionNode {

    /**
     * 时间复杂度：O(n + m)
     * 空间复杂度：O(1)
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 初始化两个指针分别指向两个链表的头节点
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        // 当两个指针不相等时循环
        // 如果某个指针到达链表末尾，则将其重定向到另一个链表的头部
        // 这样当两个指针相遇时，它们要么在交点处相遇，要么都为 null
        while (pointerA != pointerB) {
            pointerA = pointerA == null ? headB : pointerA.next;
            pointerB = pointerB == null ? headA : pointerB.next;
        }

        // 返回相遇的节点
        return pointerA;
    }
}
