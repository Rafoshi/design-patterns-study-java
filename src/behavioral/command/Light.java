package behavioral.command;

public class Light {
    boolean on;

    public void switchLight() {
        on = !on;
        System.out.println("Light on: " + on);
    }
}
