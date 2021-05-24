package factory;

/**
 * @author I-Chung, Wang
 * @date 2021/3/22 下午 04:08
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
