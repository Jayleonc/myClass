package demo07;

import java.util.ArrayList;

public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        // 首先需要一个集合，用了储存若干个红包的余额
        ArrayList<Integer> redList = new ArrayList<>();

        // 看一下群主的余额
        int leftMoney = super.getMoney();

        if (totalMoney > leftMoney) {
            System.out.println("余额不足！");
            return redList;
        }

        // 扣钱，其实就是重新设置余额
        super.setMoney(leftMoney  - totalMoney);
        // 发红包需要平均分成count份
        int avg = totalMoney / count;
        int mod = totalMoney % count; // 余数，放在最后一个红包里

        // 把红包放进集合里，除了最后一个
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }

        // 最后一个红包
        int lastRed = mod + mod;
        redList.add(lastRed);

        return redList;
    }
}
