package demo03;

public class StringEquals {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);

        String str3 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str4 = new String(charArray);
        System.out.println(str3.equals(str4));

        System.out.println("Hello".equals(str3));
        System.out.println("hello".equals(str3));
        System.out.println("hello".equalsIgnoreCase(str3));
    }
}
