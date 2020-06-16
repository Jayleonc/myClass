package ThreadDemo.demo01;

public class TestThread03 implements Runnable{
    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 500; i++) {
            System.out.println("我在看代码" + i);
        }
    }

    public static void main(String[] args) {
        // 创建runnable接口的实现类对象
        TestThread03 thread03 = new TestThread03();
        // 创建线程对象，通过线程对象来开启线程，代理
        new Thread(thread03).start();


        for (int i = 0; i < 1000; i++) {
            System.out.println("我在学习多线程" + i);
        }
    }
}
