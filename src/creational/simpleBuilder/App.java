package creational.simpleBuilder;

public class App {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.id(12321)
                .color("Orange")
                .year(2004);

        Car car = carBuilder.build();
        System.out.println(car.toString());
    }
}
