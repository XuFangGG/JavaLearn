import java.util.*;

public class Main {
  public static void main(String[] args) {
    demo2();
  }

  public static void demo() {
    int a = 10;
    int b = 20;
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.println("a= " + a);
    System.out.println("b= " + b);
  }

  public static void demo2() {
    int a = 10;
    int b = 20;
    int c = a;
    a = b;
    b = c;
    System.out.println("a= " + a);
    System.out.println("b= " + b);
  }
}