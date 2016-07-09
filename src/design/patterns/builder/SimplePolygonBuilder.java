package design.patterns.builder;

/**
 * Created by dawid on 08/07/16.
 */
public class SimplePolygonBuilder extends  PolygonBuilder {

    @Override
    public PolygonBuilder setDesc(String desc) {
        this.polygon.desc = "Simple " + desc;
        return super.setDesc(desc);
    }

}
