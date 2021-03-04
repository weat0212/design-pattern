package factory.method;


/**
 * @author I-Chung, Wang
 * @date 2021/3/3 下午 03:47
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza;

        switch (type) {
            case "cheese":
                pizza = new NYStyleCheesePizza();
                break;
            case "clam":
                pizza = new NYStyleClamPizza();
                break;
            case "veggie":
                pizza = new NYStyleVeggiePizza();
                break;
            default:
                pizza = null;
                break;
        }

        return pizza;
    }
}
