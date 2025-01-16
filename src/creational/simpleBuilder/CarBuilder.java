package creational.simpleBuilder;

public class CarBuilder {
    private int id;
    private String model;
    private String color;
    private int year;

    public void year(int year) {
        this.year = year;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }

    public Car build() {
        return new Car(id, model, color, year);
    }
}
