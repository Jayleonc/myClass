package demo11;

import java.io.File;

public class File01 {
    public static void main(String[] args) {
        show01();
        System.out.println("====================");
        show02();
        System.out.println("====================");
        show03();
        System.out.println("====================");
        show04();
    }

    private static void show04() {
        File f1 = new File("/Users/jayleonc/myClass/a.txt");
        long length1 = f1.length(); //? length() --> 指定文件大小，字节为单位，路径不存在返回0
        System.out.println(length1);

        File f2 = new File("/Users/jayleonc/myClass");
        long length2 = f2.length();
        System.out.println(length2);  // ????? 不明白

        File f3 = new File("/Users/jayleonc/myClass/b.txt"); //! 不存在
        System.out.println(f3.length());
    }

    private static void show03() {
        File f1 = new File("/Users/jayleonc/myClass/a.txt");
        String name1 = f1.getName(); //? getName() --> 返回结尾部分
        System.out.println(name1);

        File f2 = new File("/Users/jayleonc/myClass");
        String name2 = f2.getName();
        System.out.println(f2);
    }

    private static void show02() {
        File f1 = new File("/Users/jayleonc/myClass/a.txt");
        String path1 = f1.getPath(); //?    getPath() --> toString() 获取构造方法中的路径
        System.out.println(path1);

        File f2 = new File("b.txt");
        String path2 = f2.getPath();
        System.out.println(path2);
    }

    private static void show01() {
        File f1 = new File("/Users/jayleonc/myClass/a.txt");
        String absolutePath1 = f1.getAbsolutePath(); //? getAbsolutePath() --> 获取绝对路径
        System.out.println(absolutePath1);

        File f2 = new File("a.txt");
        String absolutePath2 = f2.getAbsolutePath();
        System.out.println(absolutePath2);
    }
}
