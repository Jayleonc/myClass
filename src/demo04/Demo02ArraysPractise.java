package demo04;

import java.util.Arrays;

public class Demo02ArraysPractise {

    public static void main(String[] args) {
        String str = "ahsdkzzzjfJJOI124JyyyOI14iojdddiasf";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        System.out.println("===========");

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

    }
    
}
