package ThreadDemo.demo01;


// 多线程操作同一个资源的时候，线程不安全，数据紊乱 --> 并发问题
public class TestThread04 implements Runnable {

    private int ticketNums = 10;

    @Override
    public void run() {
        while (true) {
            if (ticketNums <= 0) {
                break;
            }
            // 模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketNums-- + "票");
        }
    }

    public static void main(String[] args) {
        TestThread04 thread04 = new TestThread04();
        new Thread(thread04,"小明").start();
        new Thread(thread04,"小红").start();
        new Thread(thread04,"小黄").start();
    }
}
