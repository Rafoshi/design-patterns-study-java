package creational.simpleBuilder;

public class Car {
    private final int id;
    private final String model;
    private final String color;
    private final int year;

    public Car(int id, String model, String color, int year) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.year = year;
    }
}
