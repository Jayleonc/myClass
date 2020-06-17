package demo13;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface FristAnno {
    String className();
    String methodName();

}
