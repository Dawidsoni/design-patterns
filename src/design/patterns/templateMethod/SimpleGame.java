package design.patterns.templateMethod;

/**
 * Created by dawid on 11/07/16.
 */
public class SimpleGame {

    public void createGame() {
        step1();
        step2();
        step3();
    }

    public void step1() {
        System.out.println("Default step1");
    }

    public void step2() {
        System.out.println("Default step2");
    }

    public void step3() {
        System.out.println("Default step3");
    }

}
