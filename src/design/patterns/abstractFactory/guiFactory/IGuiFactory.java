package design.patterns.abstractFactory.guiFactory;

import design.patterns.abstractFactory.button.IButton;
import design.patterns.abstractFactory.scrollbar.IScrollbar;

/**
 * Created by dawid on 08/07/16.
 */
public interface IGuiFactory {
    IButton createButton();
    IScrollbar createScrollbar();
}
