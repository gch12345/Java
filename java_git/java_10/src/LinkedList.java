import java.util.List;

class  ListNode {
    public int val = 0;
    public ListNode next = null;
}
public class LinkedList {

    //删除链表中等于给定值 val 的所有节点。
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        while(cur != null) {
            if(cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = prev.next;
                cur = cur.next;
            }
        }
        if(head.val == val) {
            head = head.next;
        }
        return head;
    }

    //反转一个单链表
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return head;
        }
        if(head.next == null) {
            return head;
        }
        ListNode newHead = head;
        ListNode Last = null;
        ListNode cur = head.next;
        while(newHead != null) {
            newHead.next = Last;
            Last = newHead;
            newHead = cur;
            if(cur != null) {
                cur = cur.next;
            }
        }
        return Last;
    }

    //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
    //如果有两个中间结点，则返回第二个中间结点。
    public ListNode middleNode(ListNode head) {
        if(head.next == null) {
            return head.next;
        }
        ListNode slow = head.next;
        ListNode fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //输入一个链表，输出该链表中倒数第k个结点
    public ListNode FindKthToTail(ListNode head,int k) {
        if(k <= 0 || k > size(head)) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        for (; k > 0; k--) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    public int size(ListNode head) {
        int ret = 0;
        while (head != null) {
            head = head.next;
            ret++;
        }
        return ret;
    }

    //合并两个有序链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newL1 = l1;
        ListNode newL2 = l2;
        ListNode newHead = null;
        ListNode newEnd = null;
        if(newL1 == null) {
            newHead = newL2;
            return newHead;
        } else if (newL2 == null) {
            newHead = newL1;
            return newHead;
        } else if (newL1.val < newL2.val) {
            newHead = newL1;
            newEnd = newL1;
            newL1 = newL1.next;
        } else {
            newHead = newL2;
            newEnd = newL2;
            newL2 = newL2.next;
        }
        while (newL1 != null && newL2 != null) {
            if(newL1.val < newL2.val) {
                newEnd.next = newL1;
                newEnd = newEnd.next;
                newL1 = newL1.next;
            } else {
                newEnd.next = newL2;
                newEnd = newEnd.next;
                newL2 = newL2.next;
            }
        }
        if (newL1 == null) {
            newEnd.next = newL2;
        } else {
            newEnd.next = newL1;
        }
        return newHead;
    }
}
