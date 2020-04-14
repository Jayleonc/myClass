package demo08;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("实现了抽象方法，BBB");
    }

    // 接口默认方法，可以被接口实现类覆盖重写
    @Override
    public void methodDefalut() {
        System.out.println("实现类B覆盖重写接口默认方法");
    }
}
