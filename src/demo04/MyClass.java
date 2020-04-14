package demo04;

public class MyClass {

    int num;
    static int numStatic;

    public void method() {
        System.out.println("这是一个成员方法！");

        System.out.println(num);

        System.out.println(numStatic);
    }

    public static void methodStatic() {
        System.out.println("这是一个静态方法!");

        System.out.println(numStatic);

//      System.out.println(num); // 错误，静态方法不能直接访问非静态，因为内存中先有静态内容，后有非静态内容
    }
}
