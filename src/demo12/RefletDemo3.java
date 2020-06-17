package demo12;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RefletDemo3 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Class personClass = Person.class;

        Method method = personClass.getMethod("eat");
        method.invoke(p);


        Method eat = personClass.getMethod("eat", String.class);
        eat.invoke(p,"饭");

    }
}
