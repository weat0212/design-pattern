package observer;

/**
 * @author I-Chung, Wang
 * @date 2021/2/1 下午 12:48
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
