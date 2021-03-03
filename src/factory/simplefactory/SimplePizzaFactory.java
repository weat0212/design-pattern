package factory.simplefactory;

/**
 * @author I-Chung, Wang
 * @date 2021/3/3 下午 02:25
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
