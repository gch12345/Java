
class ListNode {
    public int val = 0;
    public ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

public class LinkedList {
    //编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead == null) {
            return pHead;
        }
        ListNode smallHead = new ListNode(-1);
        ListNode smallEnd = smallHead;
        ListNode bigHead = new ListNode(-1);
        ListNode bigEnd = bigHead;
        while (pHead != null) {
            if(pHead.val < x) {
                smallEnd.next = pHead;
                smallEnd = smallEnd.next;
            } else {
                bigEnd.next = pHead;
                bigEnd = bigEnd.next;
            }
            pHead = pHead.next;
        }
        if (smallHead.next != null) {
            smallEnd.next = bigHead.next;
            smallEnd.next = bigHead.next;
            return smallHead.next;
        }
        return bigHead.next;
    }

    //给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = new ListNode(-1);
        ListNode newEnd = newHead;
        while (head != null) {
            int cur = 0;
            if(head.next == null || head.val != head.next.val) {
                newEnd.next = head;
                newEnd = newEnd.next;
                head = head.next;
            }
            while(head !=null && head.next != null && head.val == head.next.val) {
                head = head.next;
                cur = 1;
            }
            if (cur == 1) {
                head = head.next;
            }
        }
        newEnd.next = null;
        return newHead.next;
    }
    //请判断一个链表是否为回文链表。
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        int size = size(head);
        ListNode newHead = null;
        ListNode newEnd = head.next;
        for (int i = 0; i < size/2; i++) {
            head.next = newHead;
            newHead = head;
            head = newEnd;
            newEnd = newEnd.next;
        }
        if(size % 2 != 0) {
            newEnd = newEnd.next;
        }
        while (newEnd != null) {
            if(newEnd.val != newHead.val) {
                return false;
            }
            newEnd = newEnd.next;
            newHead = newHead.next;
        }
        return false;
    }

    // 输入两个链表，找出它们的第一个公共结点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }
        int lenA = size(headA);
        int lenB = size(headB);
        if (lenA < lenB) {
            for(int i = 0; i < lenB - lenA; i++) {
                headB = headB.next;
            }
        } else {
            for(int i = 0; i < lenA - lenB; i++) {
                headA = headA.next;
            }
        }
        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    //给定一个链表，判断链表中是否有环
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow ==fast) {
                return true;
            }
        }
        return false;
    }

    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if(slow == fast) {
            while (head != slow) {
                head = head.next;
                slow = slow.next;
            }
            return slow;
        }
        return null;
    }


    public int size(ListNode head) {
        int ret = 0;
        while (head != null) {
            ret++;
            head = head.next;
        }
        return ret;
    }
}
