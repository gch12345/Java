public class Main {

    public static void main(String[] args) {
        testAdd();
        testContains();
        testSearch();
        testGetPos();
        testRemove();
        testClear();
    }

    public static void testAdd() {
        SeqList se = new SeqList(5);
        se.add(0, 0);
        se.add(1, 1);
        se.add(2, 2);
        se.add(3, 3);
        se.add(4, 4);
        se.add(5, 5);
        se.display();
    }

    public static void testContains() {
        SeqList se = new SeqList(5);
        se.add(0, 0);
        se.add(1, 1);
        se.add(2, 2);
        se.add(3, 3);
        se.add(4, 4);
        se.add(5, 5);
        boolean  re = se.contains(5);
        System.out.println(re);
    }

    public static void testSearch() {
        SeqList se = new SeqList(5);
        se.add(0, 0);
        se.add(1, 1);
        se.add(2, 2);
        se.add(3, 3);
        se.add(4, 4);
        se.add(5, 5);
        int re = se.search(5);
        System.out.println(re);
    }

    public static void testGetPos() {
        SeqList se = new SeqList(5);
        se.add(0, 0);
        se.add(1, 1);
        se.add(2, 2);
        se.add(3, 3);
        se.add(4, 4);
        se.add(5, 5);
        int re = se.getPos(-1);
        System.out.println(re);
    }

    public static void testRemove() {
        SeqList se = new SeqList(5);
        se.add(0, 0);
        se.add(1, 1);
        se.add(2, 2);
        se.add(3, 3);
        se.add(4, 4);
        se.add(5, 5);
        se.remove(5);
        se.display();
    }

    public static void testClear() {
        SeqList se = new SeqList(5);
        se.add(0, 0);
        se.add(1, 1);
        se.add(2, 2);
        se.add(3, 3);
        se.add(4, 4);
        se.add(5, 5);
        se.clear();
        se.display();
    }
}
