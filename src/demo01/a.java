package demo01;

public class a {
    public static void main(String args[]) {
        System.out.println("sss");
        System.out.println("============");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println("i=" + i);
        }
        System.out.println("");

        num(123, 222, 123);
    }

    public static int num(int a, int b) {

        System.out.println("num = " + a + b);
        return (a + b);
    }

    public static int num(int a, int b, int c) {

        System.out.println("num = " + a + b + c);
        return (a + b + c);
    }

    public static int num(int a, int b, int c, int d) {

        System.out.println("num = " + a + b + c + d);
        return (a + b + c + d);
    }
}

