package design.patterns.decorator;

/**
 * Created by dawid on 08/07/16.
 */
public class AlertWindow extends WindowDecorator {

    public AlertWindow(IWindow decWindow) {
        super(decWindow);
    }

    public void drawAlert() {
        System.out.println("Drawing alert");
    }

    @Override
    public void draw() {
        drawAlert();
        decWindow.draw();
    }

    @Override
    public String getDesc() {
        return "Alert " + decWindow.getDesc();
    }
}
