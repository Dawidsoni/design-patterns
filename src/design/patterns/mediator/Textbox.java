package design.patterns.mediator;

/**
 * Created by dawid on 10/07/16.
 */
public class Textbox extends AbstractWidget {
    protected String text;

    Textbox(FormMediator mediator) {
        super(mediator);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        this.mediator.widgetChanged(this);
    }

    public void addText(String text) {
        this.text += text;
        this.mediator.widgetChanged(this);
    }

}
