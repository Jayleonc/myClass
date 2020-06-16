package ThreadDemo.demo01;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

// 线程不一定立即执行，CPU安排调度

/*
* 自定义Thread类
* 重写run()方法，编写线程执行体
* 创建线程对象，调用start()方法启动线程
*/

public class TextThread02 implements Runnable{

    private String url;
    private String name;

    public TextThread02(String url, String name) {
        this.name = name;
        this.url = url;
    }


    // 下载图片线程的执行体
    @Override
    public void run() {
        WebDownloader webDownloader = new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载：" + name);
    }

    public static void main(String[] args) {
        TextThread02 t1 = new TextThread02("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590068314522&di=ea24b5f4c7619250266b0c8b979b40dd&imgtype=0&src=http%3A%2F%2Fimg1.gtimg.com%2Fln%2Fpics%2Fhv1%2F181%2F80%2F1885%2F122592706.jpg","周杰伦.jpg");
        TextThread02 t2 = new TextThread02("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1590068582419&di=a2c5101dd1502e1d63f977c5cfff6561&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20171206%2F1eadca2e2ccb4856bcaad36dfc57cbfc.jpeg", "阿信.jpg");

        // 同时执行，不按照此下载顺序
        // t1.start();
        // t2.start();

        new Thread(t1).start();
        new Thread(t2).start();
    }
}

class WebDownloader {
    // 下载方法
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}
