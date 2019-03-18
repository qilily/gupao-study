package factory;

/**
 * @author HP-01
 * @create 2019/3/16 16:56
 */
public class HamburgerTest {

    public static void main(String[] args) {
        HamburgerStore mc = new McDonalds();
        HamburgerStore kfc = new KentuckyFriedChickenStore();

        Hamburger hamburger = mc.orderHamburger("chicken");
        System.out.println(hamburger.getName());

        hamburger = kfc.orderHamburger("chicken");
        System.out.println(hamburger.getName());
    }
}
