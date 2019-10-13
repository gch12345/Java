class  DListNode {
    public int val = -1;
    public DListNode prev = null;
    public DListNode next = null;

    public DListNode(int val) {
        this.val = val;
    }
}
public class DubleLinkedList {
    private DListNode head = null;

    public DubleLinkedList() {
        head = new DListNode(-1);
        head.prev = head;
        head.next = head;
    }

    public void addFirst(int data) {
        DListNode node = new DListNode(data);
        DListNode next = head.next;
        head.next = node;
        node.prev = head;
        node.next = next;
        next.prev = node;
    }

    public void addLast(int data) {
        DListNode node = new DListNode(data);
        DListNode prev = head.prev;
        node.next = head;
        head.prev = node;
        prev.next = node;
        node.prev = prev;
    }

    public void addIndex(int index,int data) {
        int size = size(head);
        if (index < 0 || index > size) {
            return;
        }
        if(index == 0) {
            addFirst(data);
        }
        if(index == size) {
            addLast(data);
        }
        DListNode prev = head.next;
        for(int i = 1; i < index; i++) {
            prev = prev.next;
        }
        DListNode next = prev.next;
        DListNode node = new DListNode(data);
        prev.next = node;
        node.prev = prev;
        node.next = next;
        next.prev = node;
    }

    public void removeAllKey(int data) {
        DListNode cur = head.next;
        DListNode Head = head;
        DListNode node = cur.next;
        while(cur != head) {
            if(cur.val == data) {
                Head.next = node;
                node.prev = Head;
                cur = node;
                node = node.next;
            } else {
                cur = cur.next;
                Head = Head.next;
                node = node.next;
            }
        }
    }
    public void display1() {
        DListNode cur = head.next;
        System.out.print("正向 ：[");
        while (cur != head) {
            System.out.print(cur.val);
            if (cur.next != head) {
                System.out.print(",");
            }
            cur = cur.next;
        }
        System.out.println("]");
    }
    public void display2() {
        DListNode cur = head.prev;
        System.out.print("反向 ：[");
        while (cur != head) {
            System.out.print(cur.val);
            if (cur.prev != head) {
                System.out.print(",");
            }
            cur = cur.prev;
        }
        System.out.println("]");
    }
    public int size(DListNode head) {
        DListNode cur = head.next;
        int ret = 0;
        while (cur != head) {
            ret++;
            cur = cur.next;
        }
        return ret;
    }
}
