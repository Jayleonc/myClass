package demo09;

public class DemoMain {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn(); // 开机

//        Mouse mouse = new Mouse();
        // 首先进行向上转型
        USB usbMouse = new Mouse();
        // 参数是USB类型，传进去USB鼠标
        computer.useDevice(usbMouse);

        System.out.println("===========");

        // 没有使用多态写法
        Keyboard keyboard = new Keyboard();
        // 方法参数是USB类型，传进去的是 实现类对象
        computer.useDevice(keyboard); // 正确，发生了向上转型
        // 使用子类对象，匿名对象
//        computer.useDevice(new Keyboard()); // 也是正确写法


        computer.poweroff(); // 关机
    }

}
