package template;

/**
 * @author I-Chung, Wang
 * @date 2021/6/16 下午 03:52
 */
public abstract class CaffeineBeverageWithHook {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        // Let customer decide to call this function
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }


    abstract void brew();

    abstract void addCondiments();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void boilWater() {
        System.out.println("Boiling Water");
    }

    // This is a hook
    // Sub-class can override this method or not necessary
    public boolean customerWantsCondiments() {
        return true;
    }
}
