public class Test {
    public static void main(String[] arge) {
        DubleLinkedList head = new DubleLinkedList();
        head.addLast(1);
        head.addLast(2);
        head.addLast(3);
        head.addLast(4);
        head.removeAllKey(2);
        head.display1();
        head.display2();
    }
}
