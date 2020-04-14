package demo03;

public class StringGet {
    public static void main(String[] args) {
        // 获取字符串长度
        int length = "akjsldkjflkajlskdjfaklsjdflakjsdlkf".length();
        System.out.println("字符串的长度是：" + length);
        System.out.println("==========");

        // 字符串的拼接
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("==========");

        // 获取指定索引位置的单个字符
        char ch = "Hello".charAt(1);
        System.out.println("第1号索引位置的字符是：" + ch);
        System.out.println("==========");

        // 查找参数字符串在本来字符串中第一次出现的索引位置
        // 如果根本没有，返回 -1值
        String origin = "HelloWorld";
        int index = origin.indexOf("llo");
        System.out.println("第一次出现的索引位置：" + index);
        System.out.println("HelloWorld".indexOf("abc"));
        System.out.println("==========");
        int num = "HelloWorld".indexOf("abc");
        System.out.println("他俩是否相等： " + (num == -1));

    }
}
