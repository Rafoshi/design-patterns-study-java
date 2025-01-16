package creational.simpleFactory;

public class SimpleBurgerFactory {
    public Burger createBurger(String request) {
        Burger burger = null;

        //Open close principle broken
        if("BEEF".equals(request)) {
            burger = new BeefBurger();
        } else if("VEGGIE".equals(request)) {
            burger = new VeggieBurger();
        }

        return burger;
    }
}
