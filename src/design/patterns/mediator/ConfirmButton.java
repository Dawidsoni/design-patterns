package design.patterns.mediator;

/**
 * Created by dawid on 10/07/16.
 */
public class ConfirmButton extends AbstractWidget {

    ConfirmButton(FormMediator mediator) {
        super(mediator);
    }

    public void click() {
        this.mediator.widgetChanged(this);
    }


}
