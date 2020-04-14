package demo01;

import java.util.Scanner;
public class scanner {

    public static void main(String[] args) {
        dscanner one = new dscanner();
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
         
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("相加的结果是：" + sum);

        System.out.println("==================");

        System.out.println("接下来进行取最大值判断");;
        System.out.println("请输入第一个数字:");
        int demo01.a = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字:");
        int c = sc.nextInt();

        int ok = demo01.a > b ? demo01.a : b;
        int max = ok > c ? ok : c;

        System.out.println("最大值是：" + max);
        System.out.println("==================");
*/
        System.out.println("请输入姓名：");
        String inname = sc.next();
        one.setName(inname);

        System.out.println("请输入性别：");
        String insex = sc.next();
        one.setSex(insex);

        System.out.println("请输入年龄：");
        int inage = sc.nextInt();
        one.setAge(inage);


        one.show();


    }
}
