package singleton.lazy;

/**
 * 多线程测试
 *
 * @author HP-01
 * @create 2019/3/18 20:37
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
