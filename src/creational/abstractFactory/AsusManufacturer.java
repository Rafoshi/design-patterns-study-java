package creational.abstractFactory;

//Concrete factory
public class AsusManufacturer extends Company{

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
