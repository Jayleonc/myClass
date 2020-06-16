package ThreadDemo.demo01;

// 创建线程方式一：继承Thread类，重写run()方法，调用start()开启线程

// 总结：线程开启不一定立即执行，由CPU调度执行

public class TestThread01 extends Thread {
    @Override
    public void run() {
        // run方法线程体
        for (int i = 0; i < 200; i++) {
            System.out.println("我是run方法" + i);
        }
    }

    public static void main(String[] args) {
        // main线程
        // 创建一个线程对象
        TestThread01 testThread01 = new TestThread01();

        // 调用start()方法，开启线程
        testThread01.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我是main方法" + i);
        }
    }
}


