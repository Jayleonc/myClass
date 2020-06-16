package demo11;

import java.io.File;

public class File02 {
    public static void main(String[] args) {
        show01();
        System.out.println("==========");
        show02();
    }

    private static void show02() {
        File f1 = new File("/Users/jayleonc/myClass");
        System.out.println(f1.isDirectory()); //? isDirectory() --> 判断是否以文件夹结尾
        System.out.println(f1.isFile()); //? isFile() --> 判断是否以文件结尾
        //! isDirectory()、isFile() 互斥，路径必须存在

        File f2 = new File("/Users/jayleonc/my"); //! 路径不存在
        // TODO:  如果不存在，就不获取
        if (f2.exists()) {
            System.out.println(f2.isDirectory());
            System.out.println(f2.isFile());
        } else {
            System.out.println("路径不存在");
        }
    }

    private static void show01() {
        File f1 = new File("/Users/jayleonc/myClass");
        System.out.println(f1.exists()); //? exists() --> 判断是否存在

        File f2 = new File("/Users/jayleonc/my");
        System.out.println(f2.exists()); //? exists() --> 判断是否存在
    }
}
