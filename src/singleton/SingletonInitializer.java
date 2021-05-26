package singleton;

/**
 * @author I-Chung, Wang
 * @date 2021/5/26 下午 03:14
 */
public class SingletonInitializer {

    // Static Initializer create instance
    // This helps threads safe
    private static SingletonInitializer uniqueInstance = new SingletonInitializer();

    private SingletonInitializer() {}

    public static SingletonInitializer getInstance() {
        return uniqueInstance;
    }
}
