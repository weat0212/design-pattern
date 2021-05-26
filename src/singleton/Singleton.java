package singleton;

/**
 * @author I-Chung, Wang
 * @date 2021/5/26 下午 02:59
 */

/*
* This is another solution to the synchronized efficiency slow problem
* */
public class Singleton {

    // volatile tell compiler to read/write data from Main Memory
    // instead of working memory which hold by individual thread
    private volatile static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        // Only during first time execution
        if (uniqueInstance == null) {
            // synchronized field
            synchronized (Singleton.class) {
                // Check it out if it's still null
                if (uniqueInstance == null) {
                    // then create instance
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
