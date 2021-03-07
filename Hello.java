import java.util.Scanner;

public class Hello {

    // Property
    int x = 10;
    int y = 20;
    String name = "Hello";

    // Method
    public void run() {
        System.out.println("1");
        System.out.println("2");
    }

    public void walk() {
        System.out.println("111");
        System.out.println("222");
    }

    public static void main(String[] args) {
        int[] score = new int[] { 19, -4, 0, -2, 18, 21, -7 };
        int sum=0;
        for (int i = 0; i < score.length; i++){
            sum = sum + score[i];
            System.out.println(score[i] + ", ");
        }
        System.out.print(sum);
    }
}