package day5.test;

public class ArrayTest1 {
    public static void main(String[] args) {
        getSum();
    }
    /*
        数组遍历: 将数组中的每一个(所有)的内容，取出来操作

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        弊端: 代码过于臃肿，复用性很差
        改进: 使用循环改进

        --------------------------------------------------

        for (int i = 0; i < 5; i++) {
            //i = 0 1 2 3 4
            System.out.println(arr[i]);
        }

        弊端: 循环次数写死，属于硬编码
        改进: 使用数组名.length

                数组名.length : 动态获取到数组的长度 (元素个数)
        --------------------------------------------------

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

     */
    public static void printArray(){
        int[] arr = {11,22,33,44,55};

        //数组遍历快捷键 : 数组名.fori

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /*
            需求: 对数组中偶数元素做求和操作

            数组遍历的场景: 如果要完成的需求，是需要操作到数组中的 [每一个] 元素，就需要对数组进行遍历操作
         */

    public static void getSum(){

        int[] arr = {11,22,33,44,55};

        //1. 定义求和变量，准备进行累加操作
        int sum = 0;
        //2. 遍历数组，获取到每一个元素
        for (int i = 0; i < arr.length; i++) {
            //3. 判断当前元素是否是偶数
            //i : 索引
            //arr[i] : 元素
            if (arr[i] % 2 == 0){
                //4. 是的话进行累加求和
                sum += arr[i];
            }
        }

        //5. 遍历结束后，将求和结果打印
        System.out.println("偶数和是 " + sum);
    }
}
