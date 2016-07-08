package design.patterns.abstractFactory.guiFactory;

import design.patterns.abstractFactory.button.IButton;
import design.patterns.abstractFactory.button.LinuxButton;
import design.patterns.abstractFactory.scrollbar.IScrollbar;
import design.patterns.abstractFactory.scrollbar.LinuxScrollbar;

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
