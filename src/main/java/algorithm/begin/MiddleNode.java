package algorithm.begin;


/**
 * 给你单链表的头结点 head ，请你找出并返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 * 示例 1：
 * 输入：head = [1,2,3,4,5]
 * 输出：[3,4,5]
 * 解释：链表只有一个中间结点，值为 3 。
 * 示例 2：
 * 输入：head = [1,2,3,4,5,6]
 * 输出：[4,5,6]
 * 解释：该链表有两个中间结点，值分别为 3 和 4 ，返回第二个结点。
 * 提示：
 * 链表的结点数范围是 [1, 100]
 * 1 <= Node.val <= 100
 */
public class MiddleNode {
    public static void main(String[] args) {

    }

    /**
     * 数组
     * 时间复杂度O(N) N是给定链表中的结点数目
     * 空间复杂度O(N) 数组A用去的空间
     * @param head
     * @return
     */
    /*public ListNode middleNode(ListNode head) {
        ListNode[] A = new ListNode[100];
        int t = 0;
        while (head != null) {
            A[t++] = head;
            System.out.println(t);
            head = head.next;
        }
        return A[t / 2];
    }*/

    /**
     * 快慢指针
     * 时间复杂度O(N) N是给定链表中的结点数目
     * 空间复杂度O(1) 只需要常数空间slow和fast两个指针
     * @param head 头节点
     * @return 链表的中间节点
     */
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
