package factory.franchise;

/**
 * @author I-Chung, Wang
 * @date 2021/3/3 下午 04:57
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza;

        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "clam":
                pizza = new ChicagoStyleClamPizza();
                break;
            case "veggie":
                pizza = new ChicagoStyleVeggiePizza();
                break;
            default:
                pizza = null;
                break;
        }

        return pizza;
    }
}
