package day4.random;

public class RandomDemo {
    public static void main(String[] args) {
        randomTest();
    }
    public static void randomTest(){

//        声明随机数
//        Declaring random number
        java.util.Random r = new java.util.Random();

//        循环生成随机数
//        Loops generate random numbers
        for (int i = 0; i < 3; i++) {

//        生成随机数
//        Generate random numbers
            int num = r.nextInt(100) + 1;

            System.out.println(num);
        }
        System.out.println("=========================");


//        需求：生成20~80之间的随机数
//        Demand: Generate random numbers between 20~80
        for (int i = 0; i < 3; i++) {

            int num = r.nextInt(61) + 20;

            System.out.println(num);
        }
    }
}
