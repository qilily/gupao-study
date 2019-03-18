package singleton.lazy;

/**
 * 双重校验锁
 *
 * 同步存在性能问题
 *
 * @author HP-01
 * @create 2019/3/18 20:52
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton() {}

    public static LazyDoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
