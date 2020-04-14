package demo02;

import demo03.Student;

import java.util.ArrayList;

public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> List = new ArrayList<>();

        Student one = new Student("周杰伦", 20);
        Student two = new Student("陈信宏", 30);
        Student three = new Student("陈思慧", 18);
        Student four = new Student("王力宏", 45);

        List.add(one);
        List.add(two);
        List.add(three);
        List.add(four);

        for (int i = 0; i < List.size(); i++) {
            Student stu = List.get(i);
            System.out.println("姓名：" + stu.getName() + "，年龄：" + stu.getAge());
        }
    }
}