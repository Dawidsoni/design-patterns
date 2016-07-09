package design.patterns.bridge;

/**
 * Created by dawid on 09/07/16.
 */
public class OptDrawingImpl implements IDrawingImpl {

    @Override
    public void drawCircle() {
        System.out.println("Opt drawing circle");
    }

    @Override
    public void drawSquare() {
        System.out.println("Opt drawing square");
    }
}
