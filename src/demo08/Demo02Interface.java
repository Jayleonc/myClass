package demo08;

public class Demo02Interface {

    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs(); // 调用抽象方法，实际运行的是右侧实现类 MyInterfaceDefaultA
        a.methodDefalut(); // 从接口调用默认方法，实现类没有时，向上找接口
        System.out.println("===================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();
        b.methodDefalut();


    }

}
