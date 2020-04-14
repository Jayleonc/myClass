package demo08;

public class Demo03Interface {

    public static void main(String[] args) {
        MyInterfacePrivateB.methodStatic1();
        System.out.println("=============");
        MyInterfacePrivateB.methodStatic2();

       MyInterfacePrivateAImpl impl = new MyInterfacePrivateAImpl();
       impl.methodDefault1();
       impl.methodDefault2();
    }

}
