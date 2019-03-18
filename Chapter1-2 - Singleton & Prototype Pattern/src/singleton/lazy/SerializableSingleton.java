package singleton.lazy;

import java.io.Serializable;

/**
 * 序列化破坏单例
 *
 * 需要增加readResolve()方法，详解JDK源码
 *
 * @author HP-01
 * @create 2019/3/18 21:03
 */
public class SerializableSingleton implements Serializable {

    public final static SerializableSingleton INSTANCE = new SerializableSingleton();

    private SerializableSingleton() {}

    public static SerializableSingleton getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }

}
