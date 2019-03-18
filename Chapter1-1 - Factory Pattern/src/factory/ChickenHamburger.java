package factory;

/**
 * 川辣双鸡堡
 *
 * @author HP-01
 * @create 2019/3/16 16:48
 */
public class ChickenHamburger extends Hamburger {

    public ChickenHamburger() {
        name = "Sichuan Spicy Double Chicken Hamburger";
        taste = "Spicy";
        meat = "Chicken";

        toppings.add("Romaine Lettuce Cheese");
    }
}
