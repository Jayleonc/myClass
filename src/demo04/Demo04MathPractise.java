package demo04;

import java.util.Arrays;

// 计算 -10.8 到 5.9之间，绝对值大于6或者小于2的整数有多少个？
public class Demo04MathPractise {

    public static void main(String[] args) {

        int count = 0; // 符合要求的数量

        double min = Math.ceil(-10.8);
        double max = 5.9;

        /*for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i);
            if (6 < abs || abs < 2.1) {
                System.out.println(abs);
                count++;
            }
        }*/
        for (double i = min; i < max; i++) {
            double abs = Math.abs(i);
            if (6 < abs || abs < 2.1) {
                System.out.println(abs);
                count++;
            }
        }
        System.out.println("总共有：" + count);
    }

}
