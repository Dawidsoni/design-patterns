package design.patterns.state;

/**
 * Created by dawid on 11/07/16.
 */
public class Calculator {
    private IComputeState state;

    public Calculator(IComputeState state) {
        setState(state);
    }

    public void setState(IComputeState state) {
        this.state = state;
    }

    public int compute(int a, int b) {
        return state.compute(a, b);
    }

}
