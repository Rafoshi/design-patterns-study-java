package creational.abstractFactory;

//Concrete factory
public class MsiManufacturer extends Company{
    @Override
    public Gpu createGpu() {
        return new MSiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
