package demo01;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int[] array = { 10, 15, 20, 25, 30  };
        System.out.println(Arrays.toString(array));
        System.out.println("==============");

        System.out.print("[");
        for (int i = 0; i <array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ",");
            }
        }
    }
}
