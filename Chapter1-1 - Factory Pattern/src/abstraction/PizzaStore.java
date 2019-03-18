package abstraction;

/**
 * @author HP-01
 * @create 2019/3/16 16:23
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected  abstract Pizza createPizza(String type);
}
