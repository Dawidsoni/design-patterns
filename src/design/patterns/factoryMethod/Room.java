package design.patterns.factoryMethod;

/**
 * Created by dawid on 11/07/16.
 */
public class Room {

    public Door createDoor() {
        return new Door();
    }

}
