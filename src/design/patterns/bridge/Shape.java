package design.patterns.bridge;

/**
 * Created by dawid on 09/07/16.
 */
public abstract class Shape {
    protected IDrawingImpl impl;

    public abstract void draw();
    public abstract int getWidth();

}
