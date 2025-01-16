package creational.builderWDirector;

public class App {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        CarSchemaBuilder carSchemaBuilder = new CarSchemaBuilder();

        director.buildBugatti(carBuilder);
        director.buildLambo(carSchemaBuilder);

        Car bugatti = carBuilder.build();
        CarSchema lamboSchema = carSchemaBuilder.build();

        System.out.println(bugatti.toString());
        System.out.println(lamboSchema.toString());
    }
}
