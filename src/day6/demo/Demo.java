package day6.demo;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int sum = getEventNumberSum(arr);
        System.out.println(sum);

    }


    public static void knockSeven(){
        //循环出100个数字
        for (int i = 1; i <= 100; i++) {
            //寻找出数字中的个位和十位
            int ge = i % 10;
            int shi = i / 10 % 10;
            //判断出哪些数据符合缝7过的条件
            if (ge == 7 || shi == 7 || i % 7 == 0) {
                System.out.println("过");
            }else {
                System.out.println(i);
            }
        }
    }



    public static int TestEventNumberSum(int[] arr){
        //初始化元素和
        int sum = 0;
        //遍历数组元素
        for (int i = 0; i < arr.length; i++) {
//            定义个位十位
            int ge = arr[i] % 10;
            int shi = arr[i] / 10 % 10;
//            找到符合3个结果的语句然后相加
            if (ge != 7 && shi != 7 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

//    求出数组中满足要求的元素和
//    求和的元素个位和十位都不能是7, 并且只能是偶数

    public static int getEventNumberSum(int[] arr){
        //初始化sum值
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            //寻找个位十位
            int ge = arr[i] % 10;
            int shi = arr[i] / 10 % 10;
            if (ge != 7 && shi != 7 && arr[i] % 2 == 0 ) {
                sum += arr[i];
            }
        }
        return sum;
    }
}
