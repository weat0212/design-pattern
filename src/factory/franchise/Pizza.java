package factory.franchise;

import java.util.ArrayList;
import java.util.List;

/**
 * @author I-Chung, Wang
 * @date 2021/3/3 下午 04:39
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List toppings = new ArrayList<String>();

    protected void prepare() {

        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (Object topping : toppings) {
            System.out.println("  " + topping);
        }
    }

    protected void bake() {
        System.out.println("Bake for 25 mins at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in offical PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
