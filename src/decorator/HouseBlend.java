package decorator;

/**
 * @author I-Chung, Wang
 * @date 2021/2/2 下午 06:51
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
