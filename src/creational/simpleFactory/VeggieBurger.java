package creational.simpleFactory;

public class VeggieBurger extends  Burger{
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
