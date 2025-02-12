package behavioral;

public class main {
    public static void main(String[] args) {
        Room room = new Room();
        Light light = new Light();
        room.setCommand(new SwitchLightCommand(light));
        room.executeCommand();
        room.executeCommand();
    }
}
