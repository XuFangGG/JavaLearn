package day6.test;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};

        int eventNumberSum = getEventNumberSum(arr);

        System.out.println(eventNumberSum);
    }
    /*
        Demand:
                有这样的一个数组，元素是 {68,27,95,88,171,996,51,210}
                求出该数组中满足要求的元素和
                要求是: 求和的元素个位和十位都不能是7, 并且只能是偶数
     */
    public static int getEventNumberSum(int[] arr){
        //1. 定义求和变量
        int sum = 0;

        //2. 遍历数组，获取到内部的每一个元素
//            i : 索引
        for (int i = 0; i < arr.length; i++) {
            //arr[i] : 数组中的每一个元素
//            3. 将每一个元素, 拆分出个位，十位
            int ge = arr[i] % 10;
            int shi = arr[i] / 10 % 10;
//            4. 判断
            if (ge != 7 && shi != 7 && arr[i] % 2 ==0) {
                //5. 求和
                sum += arr[i];

            }
        }
        return sum;
    }
}
