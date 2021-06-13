package adapter;

/**
 * @author I-Chung, Wang
 * @date 2021/6/13 下午 03:01
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
