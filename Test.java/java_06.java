import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

// //我们实现一个自己版本的数组转字符串
// public class java_06 {
//     public static void main(String[] args) {
//         int[] arr={1,2,3,4,5};
//         String re = arrToString(arr);
//         System.out.println(re);
//     }
//     public static String arrToString(int[] arr) {
//         String re = "[";
//         for(int i = 0; i < arr.length; i++) {
//             re += arr[i];
//             if(i != arr.length - 1)
//                 re += ",";
//         }
//         re += "]";
//         return re;
//     }
// }
// //实现自己版本的拷贝数组
// public class java_06 {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4};
//         int[] re = copy(arr);
//         System.out.println("arr = "+Arrays.toString(arr));
//         System.out.println("re = "+Arrays.toString(re));
//     }
//     public static int[] copy(int[] arr) {
//         int[] re = new int[arr.length];
//         for(int i = 0; i < arr.length; i++) {
//             re[i] = arr[i];
//         }
//         return re;
//     }
// }
// //求数组中元素的平均数
// public class java_06 {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,3,5}; 
//         double re = avgNum(arr);
//         System.out.println(re);
//     }
//     public static double avgNum(int[] arr) {
//         int sum = 0;
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }
//         return (double)sum/(double)arr.length;
//     }
// }
// //查找数组中指定元素(二分查)
// public class java_06 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         int[] arr = {1,2,3,4,5,6};
//         int re = binarySearch(arr, num);
//         System.out.println(re);
//         sc.close();
//     }
//     public static int binarySearch(int[] arr, int num) {
//         int left = 0;
//         int right = arr.length;
//         while(left <= right) {
//             int mid = (left + right) / 2;
//             if(arr[mid] > num) {
//                 right = mid -1;
//             }else if(arr[mid] < num) {
//                 left = mid + 1;
//             }else {
//                 return mid;
//             }
//         }
//         return -1;
//     }
// }
// //检查数组的有序性
// public class java_06 {
//     public static void main(String[] args) {
//         int[] arr = {5,4,3,2};
//         boolean i = isSorted(arr);
//         System.out.println(i);
//     }
//     public static boolean isSorted(int[] arr) {
//         if(arr[0] > arr[1]) {
//             for(int i = 0;i < arr.length - 1;i++) {
//                 if(arr[i] < arr[i + 1]) {
//                     return false;
//                 }
//             }
//             return true;
//         }else {
//             for(int i = 0;i < arr.length - 1;i++) {
//                 if(arr[i] > arr[i + 1]) {
//                     return false;
//                 }
//             }
//             return true;
//         }
//     }
// }
// //数组排序(冒泡排序)
// public class java_06 {
//     public static void main(String[] args) {
//         int[] arr = {1,4,2,6,8,2,6,1};
//         bubbSort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void bubbSort(int[] arr) {
//         for(int i = 0; i < arr.length; i++) {
//             for(int j = 0; j < arr.length - i - 1; j++) {
//                 if(arr[j] > arr[j + 1]) {
//                     int tmp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = tmp;
//                 }
//             }
//         }
//     }
// }
// //数组逆序
// public class java_06 {
//     public static void main(String[] args) {
//         int [] arr = {1,2,3,4,5};
//         backwardArr(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void backwardArr(int[] arr) {
//         int i = 0;
//         int j = arr.length - 1;
//         while(i < j) {
//             int tmp =arr[i];
//             arr[i] = arr[j];
//             arr[j] = tmp;
//             i++;
//             j--;
//         }
//     }
// }
//给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
public class java_06 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] arr) {
        for (int i = 0, j = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;
                j++;
            }
        }
    }
    public static void transform0(int[] arr) {
        for(int j = 0, i = 1; i < arr.length; i += 2,j++) {
            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;  
        }
    }
}