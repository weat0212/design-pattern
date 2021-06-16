package template;

/**
 * @author I-Chung, Wang
 * @date 2021/6/16 下午 03:38
 */
public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("Steeping The tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
