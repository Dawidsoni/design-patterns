package test;

import design.patterns.abstractFactory.*;
import design.patterns.bridge.Circle;
import design.patterns.bridge.OptDrawingImpl;
import design.patterns.bridge.SimpleDrawingImpl;
import design.patterns.bridge.Square;
import design.patterns.builder.*;
import design.patterns.chainOfResponsibility.AbstractForm;
import design.patterns.chainOfResponsibility.AlertForm;
import design.patterns.chainOfResponsibility.SimpleForm;
import design.patterns.composite.*;
import design.patterns.decorator.*;
import design.patterns.proxy.*;
import design.patterns.singleton.*;
import org.junit.After;
import org.junit.Test;

/**
 * Created by dawid on 09/07/16.
 */
public class MainTest {

    @Test
    public void decoratorTest() {
        IWindow window = new ScrollbarWindow(new AlertWindow(new SimpleWindow()));
        window.draw();
        System.out.println(window.getDesc());
    }

    @Test
    public void abstractFactoryTest() {
        IGuiFactory factory = new LinuxFactory();
        IButton button = factory.createButton();
        IScrollbar scrollbar = factory.createScrollbar();
        button.draw();
        scrollbar.draw();
    }

    @Test
    public void builderTest() {
        PolygonBuilder builder = new ColouredPolygonBuilder("red");
        builder.setDesc("builded polygon desc").setLineThickness(2);
        builder.addPoint(new Point(2 ,3)).addPoint(new Point(3, 4));
        builder.getResult().printDesc();
    }

    @Test
    public void compositeTest() {
        Panel panel1 = new Panel("panel1");
        Panel panel2 = new Panel("panel2");
        panel2.addGraphic(new RadioButton());
        panel2.addGraphic(new RadioButton());
        panel1.addGraphic(panel2);
        panel1.addGraphic(new Panel("panel3"));
        panel1.addGraphic(new RadioButton());
        panel1.draw();
    }

    @Test
    public void proxyTest() {
        IDrawable proxy = new ImageProxy("image.txt");
        System.out.println("width " + proxy.getWidth());
        System.out.println("height " + proxy.getHeight());
    }

    @Test
    public void singletonTest() {
        Singleton s1 = SingletonFactory.getSingleton();
        Singleton s2 = SingletonFactory.getSingleton();
        s1.setVal(1);
        s2.setVal(2);
        System.out.println("Singleton val: " + s1.getVal());
    }

    @Test
    public void chainOfResponsibilityTest() {
        AbstractForm form1 = new AlertForm("Alert form help");
        AbstractForm form2 = new SimpleForm();
        AbstractForm form3 = new SimpleForm();
        form2.addForm(form3);
        form1.addForm(form2);
        System.out.println(form3.getHelp());
    }

    @Test
    public void bridgeTest() {
        Square square = new Square(new OptDrawingImpl());
        Circle circle = new Circle(new SimpleDrawingImpl());
        square.draw();
        circle.draw();
    }


    @After
    public void printNewLines() {
        System.out.println();
    }
}