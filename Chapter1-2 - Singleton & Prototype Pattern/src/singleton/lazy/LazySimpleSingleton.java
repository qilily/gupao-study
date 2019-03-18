package singleton.lazy;

/**
 * 懒汉单例，
 * 被外部类调用的时候才会创建对象
 *
 * 线程不安全
 *
 * 解决方法：
 * 1. 方法加同步锁，synchronized
 * 2. 双重校验锁
 * 3. 静态内部类
 *
 * @author HP-01
 * @create 2019/3/18 20:35
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton singleton = null;

    private LazySimpleSingleton() {}

    public static LazySimpleSingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySimpleSingleton();
        }
        return singleton;
    }
}
