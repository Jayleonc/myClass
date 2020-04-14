package demo03;


public class Convert {
    public static void main(String[] args) {
        // 转换成字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("==============");

        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==============");

        // 字符串内容的替换
        String str1 = "操你妈的！会不会玩啊！";
        String str2 = str1.replace("操你妈的","****");
        System.out.println(str1);
        System.out.println(str2);
    }
}
