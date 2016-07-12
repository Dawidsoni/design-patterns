package design.patterns.visitor;

/**
 * Created by dawid on 12/07/16.
 */
public interface IClient {
    void accept(IDispatcher dispatcher);
}
