package demo01;

public class usestudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("周杰伦");
        stu1.setAge(20);
        System.out.println("姓名：" + stu1.getName() + "，年龄：" + stu1.getAge());
        System.out.println("====================");

        Student stu2 = new Student("五月天",22);
        System.out.println("姓名：" + stu2.getName() + "，年龄：" + stu2.getAge());
    }
}
