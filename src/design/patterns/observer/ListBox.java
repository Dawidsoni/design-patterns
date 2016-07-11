package design.patterns.observer;

/**
 * Created by dawid on 11/07/16.
 */
public class ListBox implements IMouseListener {

    @Override
    public void update(Mouse mouse) {
        System.out.println("update ListBox");
    }

}
