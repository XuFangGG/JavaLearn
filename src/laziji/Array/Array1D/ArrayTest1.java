package laziji.Array.Array1D;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest1 {

    /*
            数组两种初始化的区别 :

                动态初始化: 手动指定长度, 系统分配默认初始化值
                静态初始化: 手动指定元素, 系统会根据元素的个数，计算出数组的长度
         */
    public static void main(String[] args) {
        int[] arr = initArrayFromScanner();
        System.out.println("最大值为 " + getMax(arr));



    }

    private static int[] getMinFromRandom() {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,100);
        }
        return arr;
    }

    public static int getMin(int[] arr) {

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }



    private static int[] initArrayFromScanner() {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第 " + (i + 1) + " 个数据");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }


    public static int getMax(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}

