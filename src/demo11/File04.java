package demo11;

import java.io.File;

public class File04 {
    public static void main(String[] args) {
        show01();
        System.out.println("=============");
        show02();
    }

    /*
     * listFiles() 遍历所有的子文件或目录
     */

    private static void show02() {
        File f1 = new File("/Users/jayleonc/myClass");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    /*
     * list() 返回所有子文件或目录
     * 不能遍历文件，不能遍历不存在路径，空指针异常
     * 可遍历隐藏文件或文件夹
     */

    private static void show01() {
        File f1 = new File("/Users/jayleonc/myClass");
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }
    }
}
