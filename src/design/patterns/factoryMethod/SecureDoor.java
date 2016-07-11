package design.patterns.factoryMethod;

/**
 * Created by dawid on 11/07/16.
 */
public class SecureDoor extends Door {

    SecureDoor() {}

    @Override
    public void open() {
        System.out.println("Opening secure door");
    }

}
