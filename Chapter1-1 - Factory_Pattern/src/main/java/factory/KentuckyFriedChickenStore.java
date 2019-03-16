package factory;

/**
 * 肯德基
 *
 * @author HP-01
 * @create 2019/3/16 17:01
 */
public class KentuckyFriedChickenStore extends HamburgerStore {

    @Override
    protected Hamburger createHamburger(String type) {
        if ("chicken".equals(type)) {
            return new OrleansChickenLegHamburger();
        } else if ("crawfish".equals(type)) {
            return new CrawfishHamburger();
        } else if ("codfish".equals(type)) {
            return new CodfishHamburger();
        } else {
            return null;
        }
    }
}
