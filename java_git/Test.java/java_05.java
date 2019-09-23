import java.util.Scanner;

// // 1. 实现代码: 求斐波那契数列的第 N 项 
// public class java_05 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int re =Fibo(num);
//         System.out.println(re);
//         sc.close();
//     }
//     public static int Fibo(int num) {
//         if(num <= 2) {
//             return 1;
//         }
//         return Fibo(num - 1) + Fibo(num - 2);
//     }

// }
// 2. 实现代码: 求解汉诺塔问题(提示, 使用递归) 
// 汉诺塔问题是一个经典的问题。汉诺塔（Hanoi Tower），又称河内塔，源于印度一个古老传说。 
// 大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片黄金圆盘。 
// 大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。 
// 并且规定，任何时候，在小圆盘上都不能放大圆盘，且在三根柱子之间一次只能移动一个圆盘。 
// 问应该如何操作？ 
// public class java_05 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num =sc.nextInt();
//         hanoi_tower(num,'A','B','C');
//         sc.close();   
//     }
//     public static void hanoi_tower(int num, char A,  char B, char C) {
//         if(num == 1) {
//             System.out.println(A+"->"+C);
//             return;
//         }
//         hanoi_tower(num - 1, A, C, B);
//         System.out.println(A+"->"+C);
//         hanoi_tower(num - 1, B, A, C);
//     }
// }

// 8. 实现代码: 青蛙跳台阶问题(提示, 使用递归) 
// 一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。求该青蛙跳上一个n 级的台阶总共有多少种跳法 
public class java_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int re =Jump(num);
        System.out.println(re);
        sc.close();
    }
    public static int Jump(int num) {
        if(num <= 2) {
            return 1;
        }
        return Jump(num - 1) + Jump(num - 2);
    }

}