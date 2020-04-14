package demo01;

import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();
        System.out.println("随机数字是：" + num);
        System.out.println("==========");
        for ( int i = 0; i < 20; i++ ) {
            int a = r.nextInt(10) + 1;
            System.out.println(a);
        }
    }
}
