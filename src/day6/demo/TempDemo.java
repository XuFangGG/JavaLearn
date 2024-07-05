package day6.demo;

public class TempDemo {
    public static void main(String[] args) {
        knockSeven();
    }
    public static int getEventNumberSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int ge = arr[i] % 10;
            int shi = arr[i] / 10 % 10;
            if (ge != 7 && shi != 7 && arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static void knockSeven(){
        for (int i = 1; i <= 100; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            if (ge == 7 || shi == 7 || i % 7 == 0 ) {
                System.out.println("过");
            }else {
                System.out.println(i);
            }
        }
    }

}
