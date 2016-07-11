package design.patterns.templateMethod;

/**
 * Created by dawid on 11/07/16.
 */
public class ExtGameA extends SimpleGame {

    @Override
    public void step2() {
        System.out.println("ExtGameA step2");
    }

    @Override
    public void step3() {
        System.out.println("ExtGameA step3");
    }
}
