package design.patterns.decorator;

/**
 * Created by dawid on 08/07/16.
 */
public class ScrollbarWindow extends WindowDecorator {

    public ScrollbarWindow(IWindow decWindow) {
        super(decWindow);
    }

    public void drawScrollbar() {
        System.out.println("Drawing scrollbar");
    }

    @Override
    public void draw() {
        drawScrollbar();
        decWindow.draw();
    }

    @Override
    public String getDesc() {
        return "Scrollbar " + decWindow.getDesc();
    }
}
