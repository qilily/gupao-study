package abstraction;

/**
 * 芝加哥原料工厂
 *
 * @author HP-01
 * @create 2019/3/18 13:21
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        /** 厚面包团 */
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        /** 李子番茄酱 */
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        /** 白色干酪 */
        return new Mozzarells();
    }

    @Override
    public Veggies[] createVeggies() {
        /** 菠菜、黑橄榄、茄子 */
        Veggies[] veggies = { new Spinach(), new BlackOlives(), new EggPlant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
