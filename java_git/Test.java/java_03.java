import java.util.Random;
import java.util.Scanner;
// // 1. 编写程序数一下 1到 100 的所有整数中出现多少个数字9。 
// public class java_03{
//     public static void main(String[] args) {
//         int num = 0;
//         for(int i=1; i < 100; i++){
//             if(i % 10 == 9) 
//                 num++;
//             if(((i / 10) % 10) == 9)
//                 num++;
//         }
//         System.out.println(num);    
//     }
// }
// // 2. 求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，如；153＝1＋5＋3?，则153是一个“水仙花数”。) 
// public class java_03 {
//     public static void main(String[] args) {
//         for(int i = 0; i < 1000; i++) {
//             int num_add = 0;
//             int num = i;
//             while (num > 0) {
//                 num_add += Math.pow(num % 10, 3);
//                 num /= 10;
//             }
//             if(i == num_add)
//             System.out.println(i);
//         }
//     }
// }
// 3. 编写代码模拟三次密码输入的场景。 
// 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 
// 可以重新输入，最多输入三次。三次均错，则提示退出程序 
// public class java_03 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in); 
//         System.out.println("请输入密码");
//         int i = 0;
//             while(i < 3) {
//             int num=sc.nextInt();
//             int key=12345;
//             if(num == key) {
//                 System.out.println("输入正确");
//                 return;
//             }else {
//                 System.out.println("密码错误，请重新输入");
//             }
//             i++;
//         }
//         sc.close();
//         System.out.println("密码错误超过三次，请重启");
//     }
// }
// 4. 写一个函数返回参数二进制中 1 的个数 
// 比如： 15 0000 1111 4 个 1 
// public class java_03{
//     public static void main(String[] arges){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("请输入一个数");
//         int num = sc.nextInt();
//         int re = fun(num);
//         System.out.println(re);
//     }
//     public static int fun(int num) {
//         int re = 0;
//         while(num != 0) {
//             if((num & 1) == 1) {
//                 re++;
//             }
//             num = num >>> 1;
//         }
//         return re;
//     }  
// }

// 5. 获取一个数二进制序列中所有的偶数位和奇数位，
// 分别输出二进制序列。  
// public class java_03 {
//     public static void main(String[] args) {
//         int[] oddNum=new int[16];
//         int[]  evenNum=new int[16];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("请输入一个数");
//         int num = sc.nextInt();
//         int i = 15;
//         int j = 15;
//         while(num != 0) {
//             if((num & 1) == 1) {
//                 oddNum[j] = 1;
//             }else {
//                 oddNum[j] = 0;
//             }
//             j--;
//             num = num >>> 1;
//             if((num & 1) == 1) {
//                 evenNum[i] = 1;
//             }else {
//                 evenNum[i] = 0;
//             }
//             i--;
//             num = num >>> 1;
//         }
//         System.out.print("奇数序列：");
//         Printf(oddNum);
//         System.out.print("偶数序列：");
//         Printf(evenNum);
//     }
//     public static void Printf(int[] arr) {
//         for(int i=0; i < 16; i++) {
//             System.out.printf("%d",arr[i]);
//         }
//         System.out.println();
//     }
// }
// 6. 输出一个整数的每一位. 
// public class java_03 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("请输入一个数");
//         int num = sc.nextInt();
//         if(num == 0) {
//             System.out.println(num);
//         }
//         int tmp = num;
//         int i = 0;
//         while(tmp != 0) {
//             tmp /= 10;
//             i++;
//         }
//         for(int j = i - 1; j >= 0; j--) {
//             System.out.printf("%d ",(num/(int)Math.pow(10,j))%10);
//         }
//     }
// }
// 7. 完成猜数字游戏 
// public class java_03 {
//     public static void main(String[] agre) {
//         Random random = new Random();
//         int num = random.nextInt(100) + 1;
//         System.out.println("猜字游戏");
//         System.out.println("请输入");
//         while(true) {
//             Scanner sc = new Scanner(System.in);
//             int x = sc.nextInt();
//             if(x > num) {
//                 System.out.println("猜大了");
//             }else if(x < num) {
//                 System.out.println("猜小了");
//             }else {
//                 System.out.println("恭喜你，猜对了");
//                 break;
//             }
//         }
//     }
// }
