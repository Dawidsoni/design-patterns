package test;

import design.patterns.abstractFactory.*;
import design.patterns.adapter.*;
import design.patterns.bridge.*;
import design.patterns.builder.*;
import design.patterns.chainOfResponsibility.*;
import design.patterns.command.*;
import design.patterns.composite.*;
import design.patterns.decorator.*;
import design.patterns.facade.*;
import design.patterns.factoryMethod.*;
import design.patterns.mediator.*;
import design.patterns.memento.*;
import design.patterns.observer.*;
import design.patterns.proxy.*;
import design.patterns.singleton.*;
import design.patterns.state.*;
import design.patterns.strategy.*;
import design.patterns.templateMethod.*;
import design.patterns.visitor.*;
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

    @Test
    public void strategyTest() {
        Counter counter = new Counter(new ComputeDec());
        counter.nextVal();
        System.out.println("Decrement strategy - counted val: " + counter.getVal());
    }

    @Test
    public void mediatorTest() {
        FormMediator mediator = new FormMediator();
        mediator.getTextbox().setText("abc");
        mediator.getTextbox().addText("def");
        mediator.getResetButton().click();
        mediator.getTextbox().addText("abc");
        mediator.getConfirmButton().click();
    }

    @Test
    public void adapterTest() {
        MusicPlayerAdapter adapter = new MusicPlayerAdapter(new OptMusicPlayer());
        adapter.play("mp3");
    }

    @Test
    public void facadeTest() {
        ModelFacade model = new ModelFacade();
        model.operationA();
    }

    @Test
    public void factoryMethodTest() {
        SecureRoom room = new SecureRoom();
        room.createDoor().open();
    }

    @Test
    public void observerTest() {
        Mouse mouse = new Mouse();
        ListBox listBox = new ListBox();
        MenuItem menuItem = new MenuItem();
        mouse.addListener(listBox);
        mouse.addListener(menuItem);
        mouse.mouseChange();
    }

    @Test
    public void templateMethodTest() {
        ExtGameA game = new ExtGameA();
        game.createGame();
    }

    @Test
    public void stateTest() {
        Calculator calculator = new Calculator(new PlusState());
        calculator.setState(new MinusState());
        System.out.println("Calculated value: " + calculator.compute(4, 3));
    }

    @Test
    public void visitorTest() {
        IDispatcher dispatcher = new SimpleDispatcher();
        IClient client = new SilverClient();
        client.accept(dispatcher);
    }

    @Test
    public void mementoTest() {
        PersonOriginator originator = new PersonOriginator();
        originator.setState("A", "B");
        PersonMemento memento = originator.getState();
        originator.setState("C", "D");
        originator.restoreState(memento);
        System.out.println("First name: " + originator.getState().getFirstName());
    }

    @Test
    public void commandTest() {
        ComputerUser user = new ComputerUser();
        user.compute('+', 7);
        user.compute('-', 3);
        user.compute('+', 10);
        user.undo();
        user.undo();
        System.out.println("Computed value: " + user.getValue());
    }

    @After
    public void printNewLines() {
        System.out.println();
    }
}