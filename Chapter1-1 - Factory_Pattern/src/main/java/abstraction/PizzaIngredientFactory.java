package abstraction;

/**
 * 原料工厂
 *
 * @author HP-01
 * @create 2019/3/18 13:04
 */
public interface PizzaIngredientFactory {

    /** 生面团 */
    Dough createDough();
    /** 酱汁 */
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
