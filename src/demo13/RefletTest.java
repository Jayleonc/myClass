package demo13;

import java.lang.reflect.Method;

@FristAnno(className = "demo13.demo1", methodName = "eat")
public class RefletTest {
    public static void main(String[] args) throws Exception {

        // 解析注解
        // 获取该类的字节码对象
        Class<RefletTest> refletTestClass = RefletTest.class;
        // 获取注解对象
        //! 其实就是在内存中生成了一个注解接口的子实现类对象
        /*
        public class FirstAnnoImpl implements FristAnno {
            public String className() {
                return "demo13.demo1";
            }

            public String methodName() {
                return "eat";
            }
        }
        */
        FristAnno anno = refletTestClass.getAnnotation(FristAnno.class); //? anno == firstAnnoImpl
        // 调用注解对象中的抽象方法，获得返回值
        String className = anno.className();
        String methodName = anno.methodName();

        System.out.println(className);
        System.out.println(methodName);

        /*FirstAnnoImpl firstAnno = new FirstAnnoImpl();
        String s = firstAnno.className();
        String e = firstAnno.methodName();

        System.out.println("className:" + className);
        System.out.println("s:" + s.getBytes());

        System.out.println("methodName:" + methodName.);
        System.out.println("e:" + e);*/

        // 加载该类进内存
        Class cls = Class.forName(className);

        Object obj = cls.newInstance();

        Method method = cls.getMethod(methodName);

        method.invoke(obj);

    }


}
