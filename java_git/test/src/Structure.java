//        - 设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象。
public class Structure {
    private int val1;
    private double val2;

    public Structure(int val1, double val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public Structure(int val1) {
        this.val1 = val1;
    }

    public Structure (double val2) {
        this.val2 = val2;
    }

    public int getVal1() {
        return val1;
    }

    public double getVal2() {
        return val2;
    }
}
