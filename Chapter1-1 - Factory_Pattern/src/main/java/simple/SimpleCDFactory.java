package simple;

/**
 * 简单工厂
 *
 * @author HP-01
 * @create 2019/3/13 21:55
 */
public class SimpleCDFactory {

    /**
     * 由工厂来创建对象
     * @param cdType
     * @return
     * @author HP-01
     * @date 22:29 2019/3/13
     */
    public CD createCD(CDType cdType) {
        CD cd = null;
        switch (cdType) {
            case XBOXONE: return new XBoxOneCD();
            case PS4: return new PS4CD();
            case SWITCH: return new SwitchCD();
            default: return cd;
        }
    }
}
