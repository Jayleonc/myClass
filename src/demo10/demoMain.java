package demo10;

public class demoMain {

    public static void main(String[] args) {
        //测试Object中的toString方法,Student默认继承Object类，没有重写toString方法
        Student student = new Student("jayleonc", 19);
        System.out.println(student);
        System.out.println("名字：" + student.getName() + ",年龄：" + student.getAge());
    }
}
