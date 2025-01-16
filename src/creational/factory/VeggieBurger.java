package creational.factory;

public class VeggieBurger implements Burger {
    private boolean combo;

    public boolean isCombo() {
        return combo;
    }

    public void setCombo(boolean combo) {
        this.combo = combo;
    }

    @Override
    public void prepare() {

    }
}
