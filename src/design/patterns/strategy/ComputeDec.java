package design.patterns.strategy;

/**
 * Created by dawid on 10/07/16.
 */
public class ComputeDec implements ICompute {

    @Override
    public int compute(int val) {
        return val - 1;
    }

}
