package factory;

/**
 * @author HP-01
 * @create 2019/3/16 17:02
 */
public class OrleansChickenLegHamburger extends Hamburger {

    public OrleansChickenLegHamburger() {
        name = "Orleans Chicken Leg Hamburger";
        taste = "Spicy";
        meat = "Chicken";

        toppings.add("Romaine Lettuce Cheese");
    }
}
