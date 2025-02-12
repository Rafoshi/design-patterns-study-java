package behavioral;

public class SwitchLightCommand implements Command {
    Light light;

    public SwitchLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchLight();
    }
}
