public class Main {

    public static void main(String[] args) {
        testAddFrist();
        testAddEnd();
        testSize();
        testContains();
        testDelect();
    }

    public static void testAddFrist() {
        SingleLinkedList si = new SingleLinkedList();
        si.addFrist(1);
        si.addFrist(2);
        si.display();
    }

    public static void testAddEnd() {
        SingleLinkedList si = new SingleLinkedList();
        si.addEnd(1);
        si.addEnd(2);
        si.display();
    }

    public static void testSize() {
        SingleLinkedList si = new SingleLinkedList();
        si.addFrist(1);
        si.addFrist(2);
        System.out.println(si.size());
    }

    public static void testContains() {
        SingleLinkedList si = new SingleLinkedList();
        si.addFrist(1);
        si.addFrist(2);
        System.out.println(si.contains(2));
    }

    public static void testDelect() {
        SingleLinkedList si = new SingleLinkedList();
        si.addEnd(1);
        si.addEnd(2);
        si.addEnd(3);
        si.addEnd(4);
        si.delect(0);
        si.display();
    }
}
