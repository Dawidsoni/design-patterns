package design.patterns.abstractFactory.scrollbar;

/**
 * Created by dawid on 08/07/16.
 */
public class WinScrollbar implements IScrollbar {

    @Override
    public void draw() {
        System.out.println("Drawing Windows scrollbar");
    }

}
