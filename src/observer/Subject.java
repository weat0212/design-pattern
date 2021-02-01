package observer;


/**
 * @author I-Chung, Wang
 * @date 2021/2/1 下午 12:47
 */
public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
