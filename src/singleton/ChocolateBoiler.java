package singleton;

/**
 * @author I-Chung, Wang
 * @date 2021/5/26 下午 02:29
 */

/*
* Singleton Example
* */
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // NOTICE: Race condition may happen causing by multi-threads
    // Solution: use "synchronized", but slow down efficiency
    public static synchronized ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance =  new ChocolateBoiler();
        }

        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // Fill in the mixer of chocolate & milk in the boiler
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // Drain boiled chocolate & milk
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // Boiling the content
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
