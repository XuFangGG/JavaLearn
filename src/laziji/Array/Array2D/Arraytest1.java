package laziji.Array.Array2D;

public class Arraytest1 {

    public static void main(String[] args) {
        int[][] arr = {
                {11,22,33},
                {44,55,66}
        };
        printArray(arr);
        System.out.println("===========================");
        System.out.println(getSum(arr));
    }


    int[] arr1 = {1,2,3};
    int[] arr2 = {4,5,6};
    int[][] arr3 = {arr1,arr2};
    int[][] arr4 = {{1,2,3}};




    /*
    *
    * 遍历并打印二维数组中的元素
    *
    * */

    public static void printArray(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }


    /*
     *
     * 求二维数组中所有数据的和并返回
     *
     * */


    public static int getSum(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

}
