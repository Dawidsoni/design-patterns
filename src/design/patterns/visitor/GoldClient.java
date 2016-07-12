package design.patterns.visitor;

/**
 * Created by dawid on 12/07/16.
 */
public class GoldClient implements IClient {

    @Override
    public void accept(IDispatcher dispatcher) {
        dispatcher.dispatch(this);
    }
}
