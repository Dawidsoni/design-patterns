package design.patterns.mediator;

/**
 * Created by dawid on 10/07/16.
 */
public class ResetButton extends AbstractWidget {
    protected boolean isEnabled;

    ResetButton(FormMediator mediator) {
        super(mediator);
    }

    void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void click() {
        if(isEnabled) {
            this.mediator.widgetChanged(this);
        }
    }

}
