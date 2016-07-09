package design.patterns.composite;

/**
 * Created by dawid on 08/07/16.
 */
public class Chart implements IGraphic {

    @Override
    public void draw() {
        System.out.println("Drawing chart");
    }
}
