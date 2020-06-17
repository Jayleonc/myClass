package demo12;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class RefletTest {
    public static void main(String[] args) throws Exception {

        // 创建配置文件对象
        Properties pro = new Properties();

        // 获取class目录下的配置文件，使用类加载器
        ClassLoader classLoader = RefletTest.class.getClassLoader();//! 本类的类加载器，类加载器可以找到各种文件
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        // 获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");


        // 加载该类进内存
        Class cls = Class.forName(className);

        // 创建对象
        Object obj = cls.newInstance();

        // 获取对象的方法
        Method method = cls.getMethod(methodName);

        // 执行方法
        method.invoke(obj);
    }
}
