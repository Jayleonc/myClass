package demo07;

import java.util.ArrayList;

public class MainRed {

    public static void main(String[] args) {
        Manager manager = new Manager("群主", 1000);

        Member one = new Member("成员A", 0);
        Member two = new Member("成员B", 0);
        Member three = new Member("成员C", 0);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("=====================");

        // 群主发红包
        ArrayList<Integer> listRed = manager.send(77,4);
        // 收红包
        one.receive(listRed);
        two.receive(listRed);
        three.receive(listRed);

        manager.show();
        one.show();
        two.show();
        three.show();

        Member four = new Member("成员D",0);
        four.receive(listRed);
        four.show();


        Member aa = new Member("aa",0);
        Member aaa = new Member("aaa",0);

    }

}
