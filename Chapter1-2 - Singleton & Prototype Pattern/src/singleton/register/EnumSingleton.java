package singleton.register;

/**
 * 枚举单例
 * @author HP-01
 * @date 21:11 2019/3/18
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
