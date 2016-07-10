package design.patterns.strategy;

/**
 * Created by dawid on 10/07/16.
 */
public class Counter {
    private ICompute strategy;
    private int val = 0;

    public Counter(ICompute strategy) {
        this.strategy = strategy;
    }

    public void nextVal() {
        this.val = strategy.compute(val);
    }

    public int getVal() {
        return val;
    }

}
