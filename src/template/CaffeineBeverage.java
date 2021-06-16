package template;

/**
 * @author I-Chung, Wang
 * @date 2021/6/16 下午 03:52
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void boilWater() {
        System.out.println("Boiling Water");
    }

}
