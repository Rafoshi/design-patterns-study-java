package creational.builderWDirector;

public class Director {
    public void buildBugatti(Builder builder) {
        builder.model("bugatti")
                .color("Black")
                .year(2025);
    }

    public void buildLambo(Builder builder) {
        builder.model("Lambo")
                .color("Black")
                .year(2025);
    }
}
