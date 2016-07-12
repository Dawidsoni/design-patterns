package design.patterns.visitor;

/**
 * Created by dawid on 12/07/16.
 */
public class SimpleDispatcher implements IDispatcher {

    @Override
    public void dispatch(GoldClient client) {
        System.out.println("Dispatching gold client");
    }

    @Override
    public void dispatch(SilverClient client) {
        System.out.println("Dispatching silver client");
    }

    @Override
    public void dispatch(BronzeClient client) {
        System.out.println("Dispatching bronze client");
    }
}
