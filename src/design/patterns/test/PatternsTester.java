package design.patterns.test;

import design.patterns.abstractFactory.button.IButton;
import design.patterns.abstractFactory.guiFactory.IGuiFactory;
import design.patterns.abstractFactory.guiFactory.LinuxFactory;
import design.patterns.abstractFactory.scrollbar.IScrollbar;
import design.patterns.decorator.AlertWindow;
import design.patterns.decorator.IWindow;
import design.patterns.decorator.ScrollbarWindow;
import design.patterns.decorator.SimpleWindow;

/**
 * Created by dawid on 08/07/16.
 */
public class PatternsTester {

    private void decoratorTest() {
        IWindow window = new ScrollbarWindow(new AlertWindow(new SimpleWindow()));
        window.draw();
        System.out.println(window.getDesc());
    }

    private void abstractFactoryTest() {
        IGuiFactory factory = new LinuxFactory();
        IButton button = factory.createButton();
        IScrollbar scrollbar = factory.createScrollbar();
        button.draw();
        scrollbar.draw();
    }

    public void test() {
        decoratorTest();
    }
}
