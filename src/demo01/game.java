package demo01;

import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] agrs) {
        Random r = new Random();
        int randomNum = r.nextInt(101);
        Scanner sc = new Scanner(System.in);

        while (true) {
        System.out.println("请输入你猜测的数字：");
        int guessNum = sc.nextInt();


        if ( guessNum > randomNum ) {
            System.out.println("太大了，请输入0 - " + guessNum + "之间的数字。");
        } else if ( guessNum < randomNum  ) {
            System.out.println("太小了，请输入" + guessNum + "- 100之间的数字。");
        } else {
            System.out.println("恭喜你，猜对了!");
            break;
        }
    }
        System.out.println("游戏结束!");
}
}
