package factory.method;

/**
 * @author I-Chung, Wang
 * @date 2021/3/3 下午 04:05
 */
public class PizzaOrdering {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        nyStore.orderPizza("cheese");

        System.out.println("\n");

        PizzaStore chicagoStore = new ChicagoStylePizzaStore();
        chicagoStore.orderPizza("cheese");

    }
}
