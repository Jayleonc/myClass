package demo01;

public class usephone {
    public static void main(String[] args) {
        Phone one = new Phone();

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        
        one.brand = "iPhone";
        one.price = 9999.0;
        one.color = "银色";

        System.out.println("--------------");

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        System.out.println("--------------");

        one.call("乔布斯");
        one.sendMessage();
    }
}
