package design.patterns.mediator;

/**
 * Created by dawid on 10/07/16.
 */
abstract class AbstractWidget {
    protected FormMediator mediator;

    AbstractWidget(FormMediator mediator) {
        this.mediator = mediator;
    }
}
