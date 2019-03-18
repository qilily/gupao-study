package factory;

/**
 * 小龙虾堡
 *
 * @author HP-01
 * @create 2019/3/16 16:54
 */
public class CrawfishHamburger extends Hamburger {

    public CrawfishHamburger() {
        name = "Crawfish Hamburger";
        taste = "Seafood flavor";
        meat = "Crawfish";

        toppings.add("Crawfish Greens Tomato");
    }
}
