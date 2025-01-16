package creational.builderWDirector;

public class CarBuilder implements Builder {
    private int id;
    private String model;
    private String color;
    private int year;

    public Builder year(int year) {
        this.year = year;
        return this;
    }

    public Builder color(String color) {
        this.color = color;
        return this;
    }

    public Builder model(String model) {
        this.model = model;
        return this;
    }

    public Builder id(int id) {
        this.id = id;
        return this;
    }

    public Car build() {
        return new Car(id, model, color, year);
    }
}
