package factory;

import java.util.ArrayList;
import java.util.List;

/**
 * 汉堡包
 *
 * @author HP-01
 * @create 2019/3/16 16:21
 */
public abstract class Hamburger {

    protected String name;
    protected String taste;
    protected String meat;
    protected List<String> toppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing" + name + " ...");
        System.out.println("Preparing material ...");
    }

    void fry() {
        System.out.println("Fry " + meat + " for 20 minutes at big fire");
    }

    void mix() {
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
        System.out.println("Mixing " + taste);
    }

    void bake() {
        System.out.println("Bake for 20 minutes at 200");
    }

    void pack() {
        System.out.println("Pack hamburger in official store box");
    }

    public String getName() {
        return name;
    }
}
