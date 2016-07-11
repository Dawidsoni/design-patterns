package design.patterns.factoryMethod;

/**
 * Created by dawid on 11/07/16.
 */
public class SecureRoom extends Room {

    @Override
    public Door createDoor() {
        return new SecureDoor();
    }
}
