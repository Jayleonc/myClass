package demo01;

public class dscanner {
    private String name;
    private String sex;
    private int age;

    public dscanner() {

    }

    public dscanner(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void show() {
        System.out.println("我叫：" + name + "，性别：" + sex + "，年龄：" + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int num) {
        if (num < 100 && num >=0) {
            age = num;
        } else {
            System.out.println("数据不合理");
        }
    }
}
