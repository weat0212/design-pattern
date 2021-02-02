package decorator;

/**
 * @author I-Chung, Wang
 * @date 2021/2/2 下午 05:56
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return 2.4;
    }
}
