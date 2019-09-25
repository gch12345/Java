import java.sql.Struct;

public class Main {

    public static void main(String[] args) {
        testCalculator();
        testStructure();
        testSwap();
    }

    public static void testCalculator() {
        Calculator ca = new Calculator(3, 2);
        System.out.println("num1 + num2 = " + ca.add());
        System.out.println("num1 - num2 = " + ca.sub());
        System.out.println("num1 * num2 = " + ca.mul());
        System.out.println("num1 / num2 = " + ca.div());
    }

    public  static void testStructure() {
        Structure st0 = new Structure (1, 2);
        System.out.println("st0.val1 = " + st0.getVal1());
        System.out.println("st0.val2 = " + st0.getVal2());
        Structure st1 = new Structure(1);
        System.out.println("st1.val1 = " + st1.getVal1());;
        System.out.println("st2.val2 = " + st1.getVal2());
        Structure st2 = new Structure(2.0);
        System.out.println("st2.val1 = " + st2.getVal1());
        System.out.println("st2.val2 = " + st2.getVal2());
    }

    public static void testSwap(){
        Swap sw = new Swap(1, 2);
        sw.swap();
        System.out.println("num1 = " + sw.getNum1());
        System.out.println("num2 = " + sw.getNum2());
    }
}
