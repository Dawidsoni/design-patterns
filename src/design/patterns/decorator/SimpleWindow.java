package design.patterns.decorator;

/**
 * Created by dawid on 08/07/16.
 */
public class SimpleWindow implements IWindow {

    @Override
    public void draw() {
        System.out.println("Drawing simple window");
    }

    @Override
    public String getDesc() {
        return "Simple Window";
    }
}
