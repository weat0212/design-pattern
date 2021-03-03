package simplefactory;

/**
 * @author I-Chung, Wang
 * @date 2021/3/3 下午 02:26
 */
public class Pizza {

    public void prepare() {
        System.out.println("Preparing...");
    }

    public void bake() {
        System.out.println("Baking...");
    }

    public void cut() {
        System.out.println("Cutting Pizza...");
    }

    public void box() {
        System.out.println("Boxing Pizza...");
    }
}
