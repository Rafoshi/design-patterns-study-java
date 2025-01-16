package creational.simpleFactory;

public class SimpleBurgerFactory {
    public Burger createBurger(String request) {
        Burger burger = null;

        if("BEEF".equals(request)) {
            burger = new BeefBurger();
        } else if("BEGGIe".equals(request)) {
            burger = new VeggieBurger();
        }

        return burger;
    }
}
