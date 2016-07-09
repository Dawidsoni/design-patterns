package design.patterns.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dawid on 08/07/16.
 */
public class Panel implements IGraphic {
    private List<IGraphic> graphicList = new ArrayList<IGraphic>();
    private String name;

    public Panel(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + this.name);
        for(IGraphic graphic : graphicList) {
            graphic.draw();
        }
    }

    public void addGraphic(IGraphic graphic) {
        graphicList.add(graphic);
    }

}
