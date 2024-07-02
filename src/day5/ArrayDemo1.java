package day5;

public class ArrayDemo1 {
    public static void main(String[] args) {
        arrayTest2();
    }

    /*
        数组介绍: 一种容器,可以存储同种数据类型多个值

        数组的使用场景: 发现手里数据有多个，并且这多个数据还属于同一组数据，就可以考虑使用数组容器进行维护

        初始化: 在内存中，位数组容器开辟控件，并将数据存入容器的过程

        数组的定义格式:

            1. 数据类型[] 数组名;

            2. 数据类型 数组名[];

            注意: 这种定义格式，定义出来的，只是数组类型的变量而已，内存中还没有创建出数组容器
     */

    public static void arrayTest1(){
        //变量会提示报错，因为在使用变量之前必须要对变量赋值！

        int[] array;
        int array2[];

//        System.out.println(array);
//        System.out.println(array2);

        int a;
//        System.out.println(a);
    }

    /*
        数组静态初始化格式:

                1. 完整格式(不推荐):
                            数据类型[] 数组名 = new 数据类型[]{元素1,元素2,元素3...};

                2. 简化格式(推荐):
                            数据类型[] 数组名字 = {元素1,元素2,元素3...};

        打印数组名:

                [I@4eec7777

                @ : 分割符
                [ : 当前空间，是数组类型的
                I ： 当前数组类型，是int类型
                4eec7777 : 数组的十六进制内存地址
     */

    public static void arrayTest2(){
        int [] arr1 = {11,22,33};
        double[] arr2 = {1.1,2.2,3.3};
        boolean[] tf = {false,true};

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(tf[0]);
    }
}
