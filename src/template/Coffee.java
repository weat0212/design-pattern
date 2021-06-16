package template;

/**
 * @author I-Chung, Wang
 * @date 2021/6/16 下午 03:38
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
