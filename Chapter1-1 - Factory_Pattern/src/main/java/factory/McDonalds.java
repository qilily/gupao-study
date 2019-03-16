package factory;

/**
 * 金拱门
 *
 * @author HP-01
 * @create 2019/3/16 16:22
 */
public class McDonalds extends HamburgerStore {

    @Override
    protected Hamburger createHamburger(String type) {
        if ("chicken".equals(type)) {
            return new ChickenHamburger();
        } else if ("crawfish".equals(type)) {
            return new CrawfishHamburger();
        } else if ("codfish".equals(type)) {
            return new CodfishHamburger();
        } else {
            return null;
        }
    }
}
