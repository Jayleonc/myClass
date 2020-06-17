package demo11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamCV {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/jayleonc/myClass/笑忘歌伴奏.mp3"); // 读取
        FileOutputStream fos = new FileOutputStream("/Users/jayleonc/myClass/Music/笑忘歌伴奏.mp3"); // 写入
        byte[] buff = new byte[1024]; // 缓冲区
        long begintime = System.currentTimeMillis();
        int len = 0;
        while ((len = fis.read(buff)) != -1) {
            fos.write(buff,0,len);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("消耗时间：" + (endtime - begintime) + "毫秒");

        /*释放资源（先关写的，后关读的）*/
        fos.close();
        fis.close();
    }
}
// 消耗时间：16857毫秒 --> 未使用缓冲区
// 消耗时间：44毫秒 --> 使用缓冲区
