package demo11;

import java.io.FileInputStream;
import java.io.IOException;

public class IOStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/jayleonc/myClass/Folder/1.txt");
        /*byte[] bytes = new byte[2];
        int read = fis.read(bytes);
        System.out.println(read);
        System.out.println(new String(bytes));


        read = fis.read(bytes);
        System.out.println(read);
        System.out.println(new String(bytes));


        read = fis.read(bytes);
        System.out.println(read);
        System.out.println(new String(bytes));

        read = fis.read(bytes);
        System.out.println(read);
        System.out.println(new String(bytes));

        read = fis.read(bytes);
        System.out.println(read);
        System.out.println(new String(bytes));

        read = fis.read(bytes);
        System.out.println(read);
        System.out.println(new String(bytes));*/

        byte[] bytes = new byte[1024]; // 存储读取到到多个字节
        int len = 0; // 记录每次读取到有效字节个数
        while ((len = fis.read(bytes)) != -1) {
            for (int i = 0; i < 20; i++) {
                System.out.println(new String(bytes,0,len));
            }
        }

        fis.close();
    }
}
