package design.patterns.bridge;

/**
 * Created by dawid on 09/07/16.
 */
public class Circle extends Shape {
    public Circle(IDrawingImpl impl) {
        this.impl = impl;
    }

    @Override
    public void draw() {
        impl.drawCircle();
    }

    @Override
    public int getWidth() {
        return 23;
    }

}
