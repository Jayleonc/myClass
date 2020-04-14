package demo01;

public class useperson {
    public static void main(String[] agrs) {
        Person person = new Person();
        person.show();
        person.name = "周杰伦";
        person.setAge(999);
        person.show();
    }
}
