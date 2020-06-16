import java.util.Date;

public class DemoDate {

    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        System.out.println(System.currentTimeMillis());
    }

    // * long getTime() 把日期转换成毫秒值（相当于 System.currentTimeMillis()方法）
    // * 返回自 1970年1月1日 00:00：00 GMT 以来此 Date 对象表示的毫秒数
    public static void demo03() {
        Date date3 = new Date();
        long time = date3.getTime();
        System.out.println(time);
    }

    // * Date类的代参数构造方法，Date(long date): 传递毫秒值，把毫秒值转换为 Date日期
    public static void demo02() {
        Date date2 = new Date(1586978368785L);
        System.out.println(date2);
    }

    // * Date类的空参数构造方法，Date()获取当前系统的日期和时间
    public static void demo01() {
        Date date1 = new Date();
        System.out.println(date1);
    }

}
