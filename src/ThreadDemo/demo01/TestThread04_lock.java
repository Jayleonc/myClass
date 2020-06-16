package ThreadDemo.demo01;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// 多线程操作同一个资源的时候，线程不安全，数据紊乱 --> 并发问题

/*
 * 解决线程安全问题：使用lock锁
 * Lock实现提供了比使用syschronized方法和语句课获得的更广泛的锁定操作
 * Lock接口中的方法：
 *      void lock()：获得锁
 *      void unlock()：释放锁
 */
public class TestThread04_lock implements Runnable {

    private int ticketNums = 100;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticketNums <= 0) {
                break;
            }
            // 模拟延时
            try {
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketNums + "票");
                ticketNums--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        TestThread04_lock thread04 = new TestThread04_lock();
        new Thread(thread04, "小明").start();
        new Thread(thread04, "小红").start();
        new Thread(thread04, "小黄").start();
    }
}
