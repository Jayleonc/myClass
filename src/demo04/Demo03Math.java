package demo04;

/*
* public static double abs(double num):获取绝对值
* public static double ceil(double num):向上取整
* public static double floor(double num):向下取整
* public static double round(double num):四舍五入
*
**/
public class Demo03Math {

    public static void main(String[] args) {
        // 获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-3.14));

        System.out.println("===========");
        // 向上取整
        System.out.println(Math.ceil(12.3));
        System.out.println(Math.ceil(61));
        System.out.println(Math.ceil(12.3));

        System.out.println("===========");
        // 向下取整
        System.out.println(Math.floor(69.9));
        System.out.println(Math.floor(-59));
        System.out.println(Math.floor(19.5));

        System.out.println("===========");
        // 四舍五入
        System.out.println(Math.round(-78));
        System.out.println(Math.round(64));
        System.out.println(Math.round(99));

        System.out.println(Math.PI * 10);
    }

}
