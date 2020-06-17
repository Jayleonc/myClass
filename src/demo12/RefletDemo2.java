package demo12;

import java.lang.reflect.Constructor;

public class RefletDemo2 {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Class personClass = Person.class;


        Constructor constructor = personClass.getConstructor(String.class,int.class,String.class);
//        constructor.setAccessible(true);
        Object o = constructor.newInstance("周杰伦",23,"台湾省");
        System.out.println(o);


    }
}
