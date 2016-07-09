package design.patterns.abstractFactory;

/**
 * Created by dawid on 08/07/16.
 */
class LinuxButton implements IButton {

    @Override
    public void draw() {
        System.out.println("Drawing Linux button");
    }
}
