package jdk;

import java.lang.reflect.Method;

/**
 * 模拟InvocationHandler
 * @author HP-01
 * @create 2019/3/20
 */
public interface GPInvocationHandler {

    Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
