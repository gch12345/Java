////阶乘
// public class Test{
//         public static void main(String[] args){
//                 int i = 1;
//                 int num = 0;
//                 int tmp = 1;
//                 while (i<=5){
//                         tmp=tmp*i;
//                         num=num+tmp;
//                         i++;
//                 } 
//                 System.out.println(num);
// 	}
// } 
// //根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上) 
// public class Test{
//         public static void main(String[] args) {
//                 int age = 28;
//                 if (age <= 18) {
//                         System.out.println("少年");
//                 }else if (age <= 28) {
//                         System.out.println("青年");
//                 }else if (age <= 55) {
//                         System.out.println("中年");
//                 }else {
//                         System.out.println("老年");
//                 }
//         }
// }
// //判定一个数字是否是素数 
// public class Test{
//         public static void main(String[] args) {
//                 int num = 3;
//                 int i = 2;
//                 boolean is=true;
//                 if(num ==1 || num %2 ==0 && num !=2 )
//                 {
// 	                is = false;
//                 }
//                 for (; i <= Math.sqrt(num); i++) {
//                         if (num%i == 0) {
//                                 is=false;
//                                 break;
//                         }
//                 }
//                 if (is) {
//                         System.out.println("是素数");
//                 }else {
//                         System.out.println("不是素数");
//                 }
//         }
// }
// //打印 1 - 100 之间所有的素数 
// public class Test {
//         public static void main(String[] args) {
//                 int num = 1;
//                 for(; num <= 100; num++) {
//                         int i = 2;
//                         boolean is=true;
//                         if(num ==1 || num %2 ==0 && num !=2 )
//                         {
//                                 is = false;
//                         }
//                         for (; i <= Math.sqrt(num); i++) {
//                                 if (num%i == 0) {
//                                         is=false;
//                                         break;
//                                 }
//                         }
//                         if (is) {
//                         System.out.print(num+" ");
//                         }
//                 }
//         }
// }
// //输出 1000 - 2000 之间所有的闰年
// public class Test {
//         public static void main(String[] args) {
//                 int i = 1000;
//                 for(;i <= 2000;i++) {
//                         // if(i%4 == 0&&i%100 != 0||i%400 == 0) {
//                         //         System.out.print(i + " ");
//                         // }
//                         if(i%4 == 0) {
//                                 if(i%100 != 0) {
//                                         System.out.print(i + " ");
//                                 }else if (i%400 == 0) {
//                                         System.out.print(i + " ");
//                                 }
//                         }
//                 }
//         }
// }