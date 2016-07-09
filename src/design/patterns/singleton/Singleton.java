package design.patterns.singleton;

/**
 * Created by dawid on 09/07/16.
 */
public class Singleton {
    private int val;

    Singleton() {}

    public void setVal(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }
}
