package design.patterns.abstractFactory;

/**
 * Created by dawid on 08/07/16.
 */
public class WinFactory implements IGuiFactory {

    @Override
    public IButton createButton() {
        return new WinButton();
    }

    @Override
    public IScrollbar createScrollbar() {
        return new WinScrollbar();
    }

}
