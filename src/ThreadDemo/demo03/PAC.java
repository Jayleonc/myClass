package ThreadDemo.demo03;

// 生产消费者模型 --> 缓冲区解决：管程法
public class PAC {
    public static void main(String[] args) {
        sync sync = new sync();

        new Productor(sync).start();
        new Consumer(sync).start();
    }
}

// 生产者
class Productor extends Thread {
    sync sync;

    public Productor(sync sync) {
        this.sync = sync;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            sync.push(new Chicken(i));
            System.out.println("生产了-->" + i + "只鸡");
        }
    }
}


// 消费者
class Consumer extends Thread {
    sync sync;

    public Consumer(sync sync) {
        this.sync = sync;
    }


    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("消费了-->" + sync.pop().id + "只鸡");
            sync.pop();
        }
    }
}

// 产品
class Chicken {
    int id; // 产品编号

    public Chicken(int id) {
        this.id = id;
    }
}


// 缓冲区
class sync {

    // 容器大小
    Chicken[] chickens = new Chicken[10];

    // 容器计数器
    int count = 0;

    // 放入产品
    public synchronized void push(Chicken chicken) {

        // 容器满了，等待消费
        if (count == chickens.length) {
            // 通知消费者消费
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 没有满，放入产品
        chickens[count] = chicken;
        count++;
        // 容器没满，通知消费

        // 消费
        this.notifyAll();
    }

    public synchronized Chicken pop() {
        if (count == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        Chicken chicken = chickens[count];

        // 吃完，通知生产
        this.notifyAll();
        return chicken;


    }

}




