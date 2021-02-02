package decorator;

/**
 * @author I-Chung, Wang
 * @date 2021/2/2 下午 07:14
 */
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
