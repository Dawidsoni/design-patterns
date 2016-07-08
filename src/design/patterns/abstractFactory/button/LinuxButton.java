package design.patterns.abstractFactory.button;

/**
 * Created by dawid on 08/07/16.
 */
public class LinuxButton implements IButton {

    @Override
    public void draw() {
        System.out.println("Drawing Linux button");
    }
}
