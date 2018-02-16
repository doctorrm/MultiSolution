package annotation;

import java.lang.reflect.Method;

public class ReflectProcessor {

    public void parseMethod(final Class<?> clazz) throws Exception {
        Object obj = clazz.getConstructor(new Class[]{}).newInstance(new Object[]{});
        Method[] methods = clazz.getDeclaredMethods();//抽取参数代表类的所有可触及方法
        for (Method method : methods) {
            Reflect my = method.getAnnotation(Reflect.class);//获取方法头部的注解类
            if (null != my) {
                method.invoke(obj, my.name());
            }
        }
    }
}

