package singleton.hungry;

/**
 * 饿汉单例，
 * 类加载的时候就立即初始化，并且创建单例对象。
 *
 * 优：线程安全，执行效率高
 * 缺：占用空间，内存，随着类加载而初始化
 *
 * 适用：单例对象较少的情况
 *
 * @author HP-01
 * @create 2019/3/18 20:05
 */
public class HungrySingleton {

    private static HungrySingleton SINGLETON = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return SINGLETON;
    }
}
