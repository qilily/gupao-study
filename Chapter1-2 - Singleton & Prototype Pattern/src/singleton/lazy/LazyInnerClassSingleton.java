package singleton.lazy;

/**
 * 静态内部类
 *
 * 内部类会在方法调用之前初始化
 *
 * @author HP-01
 * @create 2019/3/18 20:54
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton() {}

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.SINGLETON;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton SINGLETON = new LazyInnerClassSingleton();
    }
}
