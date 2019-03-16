package factory;

/**
 * @author HP-01
 * @create 2019/3/16 16:59
 */
public class CodfishHamburger extends Hamburger {

    public CodfishHamburger() {
        name = "Codfish Hamburger";
        taste = "Spicy";
        meat = "Codfish";

        toppings.add("Codfish Fresh Cucumber Juice Cheese");
    }
}
