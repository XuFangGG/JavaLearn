package day4.random;

import java.util.Scanner;
import java.util.Random;

public class RandomGame {
    public static void main(String[] args) {
        guessNumber();
    }
    /*
    需求：实现猜数字游戏
        Demand: Implement Guess the numbers game

        1. 使用Random生成 1~100 之间的随机数  ---> randomNumber
           Use Random to generate random numbers between 1~100

        2. 使用Scanner从键盘录入用户猜测的数据  ---> scNumber
           Use Scanner to enter the user's guessed data from the keyboard

        3. 比对
           Comparison
     */
    public static void guessNumber(){

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

//        1. 使用Random生成 1~100 之间的随机数  ---> randomNumber
        int randomNumber = r.nextInt(100) + 1;
        System.out.println(randomNumber);

//        Optimize(优化): 给用户多次机会猜数字

        while (true){

//        2. 使用Scanner从键盘录入用户猜测的数据  ---> scNumber
            System.out.println("Please enter...");
            int scNumber = sc.nextInt();

//        3. 比对
            if (scNumber == -1){
                System.out.println("已退出游戏...");
                break;
            } else if (scNumber > randomNumber) {
                System.out.println("猜大了!");
            } else if (scNumber < randomNumber) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜对了!");
                break;
            }
        }
        //如果没写break跳出循环，这行代码会报错，因为编译器会认为这个代码不会被执行
        System.out.println("恭喜");
    }
}
