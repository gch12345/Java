class Node {
    public int data = 0;
    public Node next = null;

    public Node(int data) {
        this.data = data;
    }
}
public class SingleLinkedList {
    private Node head = null;

    public  void display() {
        if(head == null)
            return;
        Node node = head;
        System.out.print("[");
        while(node != null) {
            System.out.print(node.data);
            if(node.next != null) {
                System.out.print(",");
            }
            node = node.next;
        }
        System.out.println("]");
    }

    //1. 头插
    public void addFrist(int elem) {
        Node node = new Node(elem);
        if(head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    //2. 尾插
    public void addEnd(int elem) {
        Node node = new Node(elem);
        if(head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while(cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //3. 获取长度
    public int size() {
        if(head == null) {
            return 0;
        }
        int re = 0;
        Node node = head;
        while(node != null) {
            re++;
            node = node.next;
        }
        return re;
    }
    //4. 包含元素
    public boolean contains(int elem) {
        if(head == null) {
            return false;
        }
        Node node =head;
        while(node !=null) {
            if(node.data == elem) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    //5. 移除元素
    public void delect(int key) {
        if(head == null) {
            return;
        }
        if(head.data == key) {
            head = head.next;
        }
        Node node = head;
        int re =lastPos(key);
        if(re != -1) {
            for(int i = 0; i < re - 1; i++) {
                node =node.next;
            }
            node.next = node.next.next;
        }
    }

    private int lastPos(int key) {
        Node node = head;
        int re = 0;
        while(node != null) {
            if(node.data == key) {
                return re;
            }
            node = node.next;
            re++;
        }
        return -1;
    }
}
