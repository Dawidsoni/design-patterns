package design.patterns.decorator;

/**
 * Created by dawid on 08/07/16.
 */
public abstract class WindowDecorator implements IWindow {
    protected IWindow decWindow;

    public WindowDecorator(IWindow decWindow) {
        this.decWindow = decWindow;
    }
}
