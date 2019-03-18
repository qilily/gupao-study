package abstraction;

/**
 * @author HP-01
 * @create 2019/3/18 19:10
 */
public class StoreTest {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza("cheese");

        PizzaIngredientFactory nyIngredientFactory = new NYPizzaIngredientFactory();
        CheesePizza cheesePizza = new CheesePizza(nyIngredientFactory);

        System.out.println(cheesePizza.getName());
    }
}
