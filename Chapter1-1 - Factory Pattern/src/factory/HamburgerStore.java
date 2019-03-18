package factory;

/**
 * 快餐店
 *
 * @author HP-01
 * @create 2019/3/16 16:23
 */
public abstract class HamburgerStore {

    public Hamburger orderHamburger(String type) {
        Hamburger hamburger;

        hamburger = createHamburger(type);

        hamburger.prepare();
        hamburger.fry();
        hamburger.mix();
        hamburger.bake();
        hamburger.pack();

        return hamburger;
    }

    // 使用工厂方法来处理对象的创建，交由子类具体实现
    protected  abstract Hamburger createHamburger(String type);
}
