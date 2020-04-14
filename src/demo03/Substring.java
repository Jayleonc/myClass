package demo03;

public class Substring {

    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str2 = str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = "HelloWorld";
        System.out.println(str3.substring(4,7));
        System.out.println("我好想你，陈思慧！".substring(1,9));

    }
}
