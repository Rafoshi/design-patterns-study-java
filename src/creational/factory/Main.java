package creational.factory;

public class Main {
    public static void main(String[] args) {
        BeefBurgerRestaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
        VeggieBurgerRestaurant veggieBurgerRestaurant = new VeggieBurgerRestaurant();

        var beefBurger = beefBurgerRestaurant.createBurger();
        var veggieBurger = veggieBurgerRestaurant.createBurger();

        beefBurger.prepare();
        veggieBurger.prepare();
    }
}
