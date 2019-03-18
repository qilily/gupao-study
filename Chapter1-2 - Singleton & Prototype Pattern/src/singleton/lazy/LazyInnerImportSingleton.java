package singleton.lazy;

/**
 * 静态内部单例优化
 *
 * 一旦重复创建，就抛异常
 *
 * @author HP-01
 * @create 2019/3/18 20:59
 */
public class LazyInnerImportSingleton {

    private LazyInnerImportSingleton() {
        if (LazyHolder.SINGLETON != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    public static final LazyInnerImportSingleton getInstance() {
        return LazyHolder.SINGLETON;
    }

    private static class LazyHolder {
        private static final LazyInnerImportSingleton SINGLETON = new LazyInnerImportSingleton();
    }
}
