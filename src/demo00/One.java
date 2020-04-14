package demo00;

import java.util.Random;

public class One {
    public static void main(String[] args) {
        System.out.println("这是我的第一个程序!");

        int a = 0;
        int b = 4;
        int c = a + b;
        System.out.println(c);

        int A = 10;

        if ( A == 10) {
            System.out.println(A);
        } else {
            System.out.println("A不等于10");

        }

        System.out.println("=============");
        Random random = new Random();
        int num = random.nextInt(5) + 1;
        System.out.println(num);

    }
}
