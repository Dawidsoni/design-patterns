package design.patterns.abstractFactory.scrollbar;

/**
 * Created by dawid on 08/07/16.
 */
public class LinuxScrollbar implements IScrollbar {

    @Override
    public void draw() {
        System.out.println("Drawing Linux scrollbar");
    }

}
