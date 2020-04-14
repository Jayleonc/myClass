package demo07;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        // 从多个红包中随机抽一个给我自己
        int index = new Random().nextInt(list.size());
        // 根据索引，获取一个，然后删除一个
        int delta = list.remove(index);
        // 看看我有多少钱
        int money = super.getMoney();
        // 将得到的红包钱加上去，加法
        super.setMoney(money + delta);
    }

}
