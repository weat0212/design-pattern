package adapter;

/**
 * @author I-Chung, Wang
 * @date 2021/6/13 下午 03:45
 */
public class DuckAdapter implements Turkey {

    Duck duck;

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
