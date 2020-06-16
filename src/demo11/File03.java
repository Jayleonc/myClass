package demo11;

import java.io.File;
import java.io.IOException;

public class File03 {
    public static void main(String[] args) throws IOException {
//        show01();
//        show02();
        show03();
    }

    /*
     *  delete() 删除由此File表示的文件或目录
     *  可以删除文件夹和文件，返回值：布尔值
     *  直接从硬盘删除，不走回收站，删除需谨慎
     *  .....
     */

    private static void show03() {
        File f1 = new File("/Users/jayleonc/myClass/Folder");
        boolean delete = f1.delete();
        System.out.println(delete);
    }

    /*
     *  mkdir() 创建单级空文件夹
     *  mkdirs() 创建单击和多级空文件夹
     *  此方法只能创建文件夹，不能创建文件，返回值为布尔值
     */

    private static void show02() {
        File f1 = new File("/Users/jayleonc/myClass/newFolder");
        System.out.println(f1.mkdir());

        File f2 = new File("/Users/jayleonc/myClass/Folder/Jayleonc/Chen");
        System.out.println(f2.mkdirs());
    }

    /*
     *  createNewFile()：当文件不存在时，创建一个空文件
     *  此方法只能创建文件，不能创建文件夹
     *  创建文件当路径必须存在，否则将抛出异常
     */

    private static void show01() throws IOException {
        File f1 = new File("/Users/jayleonc/myClass/newFile.txt");
        boolean newFile = f1.createNewFile();
        System.out.println(f1);
    }
}
