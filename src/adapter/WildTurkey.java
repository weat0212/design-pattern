package adapter;

/**
 * @author I-Chung, Wang
 * @date 2021/6/13 下午 03:04
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
