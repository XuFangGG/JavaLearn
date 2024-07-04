package laziji.Day6;

import java.util.Random;
import java.util.Scanner;


public class Demo1 {


    public static void main(String[] args) {
        knockSeven();
//        int[] arr1 = {68,27,95,88,171,996,51,210,88,88,88,88,88};
//        int[] arr2 = {100,10,50,66};
//        int[] arr3 = {100,10,50,66};
//        Scanner scanner = new Scanner(System.in);
//
//
//        逢七跳过
//
//
        knockSeven();
//        System.out.println("---------------------------");
//        System.out.println(getEvenNumberSum(arr1));
//
//        检查数组值是否相等
//
//        System.out.println(checkArrayContent(arr1,arr2));
//        System.out.println(checkArrayContent(arr2,arr3));
//
//        通过值获得索引
//
//        System.out.println("输入值");
//        System.out.println(getIndexFromArray(scanner.nextInt(),arr1));
//        int[] moreIndexFromArray = getMoreIndexFromArray(scanner.nextInt(), arr1);
//        for (int i = 0; i < moreIndexFromArray.length; i++) {
//            System.out.println(moreIndexFromArray[i]);
//        }
//
//        倒转数组
//
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println("倒转前 " + arr2[i]);
//
//        }
//        int[] result = reversalArray(arr2);
//        for (int i = 0; i < result.length; i++) {
//            System.out.println("倒转后 " + result[i]);
//        }


//        for (int i = 0; i < 2; i++) {
//            String captcha = getCaptcha();
//            System.out.print("验证码为" + captcha + "\n请输入验证码: ");
//            String userCaptcha = scanner.next();
//            if (captcha.equals(userCaptcha)){
//                System.out.println("验证码正确");
//                break;
//            }else {
//                System.out.println("验证码错误,请重新尝试");
//                i--;
//            }
//        }


    }

    /*
    *
    * 输出1-100个数,满足逢7跳过
    *
    * */

    public static void knockSeven(){

        for (int i = 1; i <= 100 ; i++) {
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 ==7){
                System.out.println("过");
            }
            else {
                System.out.println(i);
            }
        }


    }

    /*
    * 要求： 求和的元素各位和十位都不能是7,并且只能是偶数
    * */
    public static int getEvenNumberSum(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 && arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }


    /*
    * 需求 比较两个数组内容完全相等
    * 要求 长度,内容,顺序完全相等
    * */
    public static boolean checkArrayContent(int[] arr1, int[] arr2){
        if (arr1.length == arr2.length){
            for (int i = 0; i < arr1.length; i++) {
               if (arr1[i] == arr2[i]){
                   return true;
               }
               else return false;
            }
        }

        return false;
    }


    /*
    * 在数组中查找数据在数组中的索引
    * */

    public static int getIndexFromArray(int num, int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }

        return -1;
    }

    public static int[] getMoreIndexFromArray(int num, int[] arr){
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) cont++;
        }
        int[] result = new int[cont];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                result[index] = i;
                index++;
            }
        }
        if (result[0] == 0){
            result[0] = -1;
        }

        return result;
    }

    /*
    *
    * 反转数组中的数据
    *
    * */

    public static int[] reversalArray(int[] arr){
        int[] result = new int[arr.length];
        int index = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[index];
            index--;
        }
        return result;

    }

    /*
    * 评委打分
    * */

    public static int getAverageScoreFromScanner(){
        int[] arr = new int[6];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请第" + (i + 1) + "位评委评分");
            arr[i] = scanner.nextInt();
        }
        int max = getMax(arr);
        int min = getMin(arr);
        int allScore = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max || arr[i] != min){
                allScore += arr[i];

            }
        }
        return allScore / 4;
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


    public static int getMax(int[] arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


    /*
    * 生成验证码
    * */

    public static String getCaptcha(){
        String captcha = "";
        int index = 0;
        char[] chs = new char[26 + 26 + 10];
        for (char i = 'a'; i <= 'z'; i++) {
            chs[index] = i;
            index++;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            chs[index] = i;
            index++;
        }
        for (char i = '0'; i <= '9'; i++) {
            chs[index] = i;
            index++;
        }
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            captcha += chs[random.nextInt(chs.length)];
        }
        return captcha;
    }
}
