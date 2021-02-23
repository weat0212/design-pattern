package decorator;

/**
 * @author I-Chung, Wang
 * @date 2021/2/2 下午 07:15
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {

        //Set the price according to the size of the beverage
        double cost = beverage.cost();
        if (getSize().equals("TALL")) {
            cost += .10;
        } else if (getSize().equals("GRANDE")) {
            cost += .15;
        } else if (getSize().equals("VENTI")) {
            cost += .20;
        }
        return cost;
    }
}
