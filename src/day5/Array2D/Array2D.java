package day5.Array2D;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr3 = {
                {1,2,3},
                {4,5,6}
        };

        for (int i = 0; i < arr3.length; i++) {
            for (int i1 = 0; i1 < arr3[i].length; i1++) {
                System.out.println(arr3[i][i1]);
            }
        }
    }
}
