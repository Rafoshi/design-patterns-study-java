package creational.builderWDirector;

public interface Builder {
    Builder id(int id);
    Builder color(String color);
    Builder model(String model);
    Builder year(int year);
}
