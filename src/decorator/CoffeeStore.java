package decorator;

/**
 * @author I-Chung, Wang
 * @date 2021/2/2 下午 06:58
 */
public class CoffeeStore {
    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        beverage.setSize("TALL");
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setSize("VENTI");
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize("GRANDE");
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
