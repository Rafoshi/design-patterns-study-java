package creational.factory;

public class Restaurant {
    public Burger orderBurger(String request) {
        Burger burger = null;

        if("BEEF".equals(request)) {
            burger = new BeefBurger();
        } else if("BEGGIe".equals(request)) {
            burger = new VeggieBurger();
        }

        assert burger != null;
        burger.prepare();
        return burger;
    }
}
