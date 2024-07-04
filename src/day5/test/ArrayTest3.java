package day5.test;

import java.util.Random;
import java.util.Scanner;

public class ArrayTest3 {
    // CTRL + ALT + M 抽取方法快捷键

    /*
        数组两种初始化的区别 :

            动态初始化: 手动指定长度, 系统分配默认初始化值
            静态初始化: 手动指定元素, 系统会根据元素的个数,计算出数组的长度

        两种初始化的使用选择 :

            1. 静态初始化: 如果要操作的数据，需求中已经明确给出了，直接静态初始化
                            需求: 已知班级学生成绩为 100 100 90 20 100 找出最高分
                            int[] arr = {100,100,90,20,100};

            2. 动态初始化: 只明确元素个数，不明确具体数值
                            需求1: 键盘录入5个学生成绩,找出最高分
                            需求2: 产生10个1~100之间的随机数，找出最小值

     */
    public static void main(String[] args) {
        int[] arr = randomNumberMin();
        int min = getMin(arr);
        System.out.println("最小值" + min);
    }

    private static int[] initArrayFromScanner() {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter...");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[] randomNumberMin(){
        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(1,100);
            arr[i] = randomNumber;
        }
        return arr;

    }

    public static int getMax(int[] arr){
        return ArrayTest2.getMax(arr);
    }

    public static int getMin(int[] arr) {
        return ArrayTest2.getMin(arr);
    }
}
