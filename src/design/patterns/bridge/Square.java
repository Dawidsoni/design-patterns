package design.patterns.bridge;

/**
 * Created by dawid on 09/07/16.
 */
public class Square extends Shape {
    public Square(IDrawingImpl impl) {
        this.impl = impl;
    }

    @Override
    public void draw() {
        impl.drawSquare();
    }

    @Override
    public int getWidth() {
        return 33;
    }
}
