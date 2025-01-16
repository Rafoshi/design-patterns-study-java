package creational.builderWDirector;

public class CarSchema {
    private final int id;
    private final String model;
    private final String color;
    private final int year;

    public CarSchema(int id, String model, String color, int year) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
