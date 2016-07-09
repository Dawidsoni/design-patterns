package design.patterns.abstractFactory;

/**
 * Created by dawid on 08/07/16.
 */
public class LinuxFactory implements IGuiFactory {

    @Override
    public IButton createButton() {
        return new LinuxButton();
    }

    @Override
    public IScrollbar createScrollbar() {
        return new LinuxScrollbar();
    }

}
