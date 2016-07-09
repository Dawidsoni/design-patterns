package design.patterns.abstractFactory;

/**
 * Created by dawid on 08/07/16.
 */
class WinScrollbar implements IScrollbar {

    @Override
    public void draw() {
        System.out.println("Drawing Windows scrollbar");
    }

}
