public class Main {

    public static void main(String[] args) {
        Calculator ca = new Calculator(3, 2);
        System.out.println("num1 + num2 = " + ca.add());
        System.out.println("num1 - num2 = " + ca.sub());
        System.out.println("num1 * num2 = " + ca.mul());
        System.out.println("num1 / num2 = " + ca.div());
    }
}
