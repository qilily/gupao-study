package singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射破坏单例
 *
 * @author HP-01
 * @create 2019/3/18 20:57
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        try {
            Class<?> clazz = LazyInnerClassSingleton.class;

            Constructor c = clazz.getDeclaredConstructor(null);

            c.setAccessible(true);

            Object o1 = c.newInstance();
            Object o2 = c.newInstance();

            System.out.println(o1 == o2);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
