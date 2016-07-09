package design.patterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dawid on 08/07/16.
 */
public class Polygon {
    List<Point> pointList = new ArrayList<Point>();
    String color = "black";
    int lineThickness = 1;
    String desc = "";

    Polygon() {}

    public void printDesc() {
        System.out.println(desc);
    }
}
