package creational.simpleFactory;

public class Restaurant {
    public Burger orderBurger(String request) {
        SimpleBurgerFactory burgerFactory = new SimpleBurgerFactory();
        Burger burger = burgerFactory.createBurger(request);

        assert burger != null;
        burger.prepare();
        return burger;
    }
}
