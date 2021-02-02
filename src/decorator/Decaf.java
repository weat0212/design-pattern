package decorator;

/**
 * @author I-Chung, Wang
 * @date 2021/2/2 下午 06:53
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.8;
    }
}
