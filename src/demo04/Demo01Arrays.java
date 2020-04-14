package demo04;

import java.util.Arrays;
/*
* sort  排序
* */
public class Demo01Arrays {

    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {2, 4, 9, 1, 6, 98, 56, 23};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2 = {"aaa","ccc","ddd","bbb"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }

}
