package design.patterns.abstractFactory;

/**
 * Created by dawid on 08/07/16.
 */
public interface IGuiFactory {
    IButton createButton();
    IScrollbar createScrollbar();
}
