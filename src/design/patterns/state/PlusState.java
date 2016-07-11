package design.patterns.state;

/**
 * Created by dawid on 11/07/16.
 */
public class PlusState implements IComputeState {

    @Override
    public int compute(int a, int b) {
        return a + b;
    }
}
