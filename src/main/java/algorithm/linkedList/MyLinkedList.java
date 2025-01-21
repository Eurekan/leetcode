package algorithm.linkedList;

public class MyLinkedList {
    /// 单链表
    /*private int size;
    private ListNode head;

    public MyLinkedList() {
        this.size = 0;
        this.head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode listNode = new ListNode(val);
        listNode.next = head.next;
        head.next = listNode;
        size++;
    }

    public void addAtTail(int val) {
        ListNode listNode = new ListNode(val);
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = listNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode listNode = new ListNode(val);
        listNode.next = pre.next;
        pre.next = listNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
        size--;
    }*/

    /// 双链表
    private int size;
    private ListNode head, tail;

    public MyLinkedList() {
        this.size = 0;
        this.head = new ListNode(0);
        this.tail = new ListNode(0);
        this.head.next = tail;
        this.tail.next = head;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode cur = head;
        if (index >= size / 2) {
            cur = tail;
            for (int i = 0; i < size - index; i++) {
                cur = cur.prev;
            }
        } else {
            for (int i = 0; i <= index; i++) {
                cur = cur.next;
            }
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
        size++;
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }

        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        ListNode listNode = new ListNode(val);
        listNode.next = pre.next;
        listNode.prev = pre;
        pre.next = listNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next.next.prev = pre;
        pre.next = pre.next.next;
        size--;
    }
}
