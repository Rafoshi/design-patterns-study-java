package creational.factory;

public class BeefBurger implements Burger {
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
