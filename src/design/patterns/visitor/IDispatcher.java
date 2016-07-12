package design.patterns.visitor;

/**
 * Created by dawid on 12/07/16.
 */
public interface IDispatcher {
    void dispatch(GoldClient client);
    void dispatch(SilverClient client);
    void dispatch(BronzeClient client);
}
