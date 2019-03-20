package test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 * @author HP-01
 * @create 2019/3/19 15:48
 */
public class JDKProxyObject implements InvocationHandler {

    // 被代理对象
    private TargetObject target;

    public Object getInstance(TargetObject target) throws Exception {
        this.target = target;

        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target, args);
        after();
        return obj;
    }

    private void before() {
        System.out.println("前置方法");
    }

    private void after() {
        System.out.println("后置方法");
    }
}
