package factory.method;


/**
 * @author I-Chung, Wang
 * @date 2021/3/3 下午 03:44
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

    protected abstract Pizza createPizza(String type);
}
