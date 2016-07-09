package design.patterns.builder;

/**
 * Created by dawid on 08/07/16.
 */
public abstract class PolygonBuilder {
    protected Polygon polygon;

    public PolygonBuilder() {
        this.polygon = new Polygon();
    }

    public PolygonBuilder addPoint(Point point) {
        this.polygon.pointList.add(point);
        return this;
    }

    public PolygonBuilder setLineThickness(int lineThickness) {
        this.polygon.lineThickness = lineThickness;
        return this;
    }

    public PolygonBuilder setDesc(String desc) {
        this.polygon.desc = desc;
        return this;
    }

    public Polygon getResult() {
        return polygon;
    }
}
