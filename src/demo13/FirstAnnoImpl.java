package demo13;

import java.lang.annotation.Annotation;

public class FirstAnnoImpl implements FristAnno{
    @Override
    public String className() {
        return "demo13.demo1";
    }

    @Override
    public String methodName() {
        return "eat";
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
