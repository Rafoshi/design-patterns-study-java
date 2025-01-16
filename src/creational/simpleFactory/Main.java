package creational.simpleFactory;

public class Main {
    public static void main(String[] args) {
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        Burger beffBurger = factory.createBurger("BEEF");
        Burger veggieBurger = factory.createBurger("VEGGIE");

        beffBurger.prepare();
        veggieBurger.prepare();
    }
}
