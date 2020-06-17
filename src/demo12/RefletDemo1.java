package demo12;

import java.lang.reflect.Field;

public class RefletDemo1 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Class personClass = Person.class;
        Field[] fields = personClass.getFields(); // 获取public修饰的成员变量
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("++++++++++++++++++");

        Field[] df = personClass.getDeclaredFields(); // 获取所有成员变量，不考虑修饰符
        for (Field field : df) {
            System.out.println(field);
        }

        System.out.println("====================");

        Field age = personClass.getDeclaredField("age");
        age.setAccessible(true); // 暴力反射
        age.set(p,18);
        System.out.println(age);
        System.out.println(p.getAge());


    }
}
