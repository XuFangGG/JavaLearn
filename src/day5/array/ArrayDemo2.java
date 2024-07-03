package day5.array;

public class ArrayDemo2 {
    public static void main(String[] args) {
        arryTest();
    }

    /*
        数组元素访问格式 :
                数组名[索引];

                索引 : 数组容器中控件所对应的编号,编号从0开始，逐个+1增长
     */
    public static void arryTest(){

        int[] arr = {11,22,33,44,55};

        //取出数组中 22 元素，打印在控制台
        System.out.println(arr[1]);

        //判断数组中第一个元素，是奇数还是偶数
        if (arr[0] % 2 == 0){
            System.out.println(arr[0] + "是一个偶数");
        }else {
            System.out.println(arr[0] + "是一个奇数");
        }
        //修改数组中第三给元素为66
        arr[2]= 66;
        System.out.println(arr[2]);

        //根据数组中第四个元素，决定在控制台打印多少次的HelloWorld
        for (int i = 0; i < arr[3]; i++) {
            System.out.println("HelloWorld");
        }
    }
}
