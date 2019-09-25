//        - 实现交换两个变量的值。要求：需要交换实参的值。
public class Swap {
    private int num1;
    private int num2;

    public Swap(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
    public void swap() {
        int tmp = this.num1;
        this.num1 = this.num2;
        this.num2 = tmp;
    }
}
