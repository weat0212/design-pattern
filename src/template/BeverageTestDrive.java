package template;

/**
 * @author I-Chung, Wang
 * @date 2021/6/16 下午 04:50
 */
public class BeverageTestDrive {
    public static void main(String[] args) {

        TeaWithHook tea = new TeaWithHook();
        CoffeeWithHook coffee = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
