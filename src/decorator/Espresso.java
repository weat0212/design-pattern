package decorator;

/**
 * @author I-Chung, Wang
 * @date 2021/2/2 下午 06:49
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
