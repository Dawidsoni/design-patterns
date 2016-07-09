package design.patterns.bridge;

/**
 * Created by dawid on 09/07/16.
 */
public class SimpleDrawingImpl implements IDrawingImpl {

    @Override
    public void drawCircle() {
        System.out.println("Simple drawing circle");
    }

    @Override
    public void drawSquare() {
        System.out.println("Simple drawing square");
    }
}
