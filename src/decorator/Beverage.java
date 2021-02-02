package decorator;

/**
 * @author I-Chung, Wang
 * @date 2021/2/2 下午 05:55
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
