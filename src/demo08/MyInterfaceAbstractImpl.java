package demo08;

/*
 * 接口的使用步骤：
 * 不能直接使用，必须有一个实现类来实现，格式：
 * public class 实现类名称 implement 接口名称 {
 *   // ...
 * }
 * */
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract {
    @Override
    public void metbodAbs1() {
        System.out.println("这是第一个方法！");
    }

    @Override
    public void metbodAbs2() {
        System.out.println("这是第二个方法！");
    }

    @Override
    public void metbodAbs3() {
        System.out.println("这是第三个方法！");
    }

    @Override
    public void metbodAbs4() {
        System.out.println("这是第四个方法！");
    }
}
