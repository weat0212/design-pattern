package factory.franchise;

/**
 * @author I-Chung, Wang
 * @date 2021/3/3 下午 04:05
 */
public class PizzaOrdering {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza("cheese");

        PizzaStore pizzaStore2 = new NYStylePizzaStore();
        pizzaStore.orderPizza("clam");

        PizzaStore pizzaStore3 = new NYStylePizzaStore();
        pizzaStore.orderPizza("veggie");
    }
}
