package abstraction;

/**
 * 纽约原料工厂
 *
 * @author HP-01
 * @create 2019/3/18 13:14
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        /** 番茄酱 */
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        /** 巴马干酪 */
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        /** 蒜、洋葱、辣椒 */
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
