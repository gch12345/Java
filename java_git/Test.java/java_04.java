import java.util.Scanner;

// // 2. 实现代码: 递归求 N 的阶乘 
// public class java_04 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("请输入一个数");
//         int num = sc.nextInt();
//         int re = Factorial(num);
//         System.out.println(num+"的阶乘是:"+re);
//         sc.close();
//     }    
//     public static int Factorial(int num){
//         if(num <= 1){
//             return num;
//         }
//         return num*Factorial(num - 1);
//     }
// }
// // 3. 实现代码: 递归求 1 + 2 + 3 + ... + 10
// public class java_04{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int re = add(num);
//         System.out.println(re);
//         sc.close();
//     }
//     public static int add(int num) {
//         if(num <= 1) {
//             return num;
//         }
//         return num + add(num - 1);
//     }
// } 
// // 4. 实现代码: 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) 
//  public class java_04 {
//      public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          int num =sc.nextInt();
//          Printf(num);
//          sc.close();
//      }
//      public static void Printf(int num) {
//          if(num < 10) {
//              System.out.print(num+" ");
//              return;
//          }
//          Printf(num/10);
//          System.out.print(num%10+" ");
//      }
//  }
// 5. 实现代码: 写一个递归方法，输入一个非负整数，返回组成它的数字之和. 
public class java_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int re = num_add(num);
        System.out.println(re);
        sc.close();
    }
    public static int num_add(int num) {
        if(num < 10){
            return num;
        }
        return num%10 + num_add(num/10);
    }
}