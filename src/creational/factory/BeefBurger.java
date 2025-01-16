package creational.factory;

public class BeefBurger extends Burger {
    private boolean angus;

    public boolean isAngus() {
        return angus;
    }

    public void setAngus(boolean angus) {
        this.angus = angus;
    }

    @Override
    public void prepare() {

    }
}
