package demo04;
/*
* 静态方法当中不能使用this。
* 原因：this代表当前对象，通过谁调用的方法，谁就是当前对象
*
*/
public class StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();

        MyClass.methodStatic();
    }
}
