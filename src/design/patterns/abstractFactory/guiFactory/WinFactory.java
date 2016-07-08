package design.patterns.abstractFactory.guiFactory;

import design.patterns.abstractFactory.button.IButton;
import design.patterns.abstractFactory.scrollbar.IScrollbar;
import design.patterns.abstractFactory.scrollbar.WinButton;
import design.patterns.abstractFactory.scrollbar.WinScrollbar;

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
