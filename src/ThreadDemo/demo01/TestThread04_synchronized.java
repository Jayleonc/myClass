package ThreadDemo.demo01;


// 多线程操作同一个资源的时候，线程不安全，数据紊乱 --> 并发问题

// *使用同步代码块解决线程安全问题
// *syschronized(锁对象) { 可能会出现线程安全问题的代码（访问了共享数据的代码）}
/*
 * 通过代码块的锁对象，可以使用任意的对象
 * 必须保证多个线程使用的锁对象是同一个
 * 锁对象的作用：把同步代码块锁住，只让一个线程在同步代码块中执行
 */

public class TestThread04_synchronized implements Runnable {

    private int ticketNums = 100;
    Object object = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (ticketNums <= 0) {
                    break;
                }
                // 模拟延时
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->卖出了第" + ticketNums + "票");
                ticketNums--;
            }
        }
    }

    public static void main(String[] args) {
        TestThread04_synchronized thread04 = new TestThread04_synchronized();
        new Thread(thread04,"窗口1").start();
        new Thread(thread04,"窗口2").start();
        new Thread(thread04,"窗口3").start();
    }
}
