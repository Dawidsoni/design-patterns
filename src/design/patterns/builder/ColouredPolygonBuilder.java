package design.patterns.builder;

/**
 * Created by dawid on 08/07/16.
 */
public class ColouredPolygonBuilder extends PolygonBuilder {

    public ColouredPolygonBuilder(String color) {
        super();
        this.polygon.color = color;
    }

    @Override
    public PolygonBuilder setDesc(String desc) {
        this.polygon.desc = "Coloured " + desc;
        return super.setDesc(desc);
    }

}
