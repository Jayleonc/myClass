package demo01;

public class Print {

    public static void main(String[] args) {
        myprint(110);
        myprint("Hello,World!!!");
    }

    public static void myprint(byte num) {
        System.out.println(num);
    }

    public static void myprint(short num) {
        System.out.println(num);
    }

    public static void myprint(int num) {
        System.out.println(num);
    }

    public static void myprint(String str) {
        System.out.println(str);
    }

}
