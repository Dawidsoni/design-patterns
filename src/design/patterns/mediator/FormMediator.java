package design.patterns.mediator;

/**
 * Created by dawid on 10/07/16.
 */
public class FormMediator {
    protected ResetButton resetButton;
    protected Textbox textbox;
    protected ConfirmButton confirmButton;

    public FormMediator() {
        resetButton = new ResetButton(this);
        textbox = new Textbox(this);
        confirmButton = new ConfirmButton(this);
    }

    public ResetButton getResetButton() {
        return resetButton;
    }

    public Textbox getTextbox() {
        return textbox;
    }

    public ConfirmButton getConfirmButton() {
        return confirmButton;
    }

    public void widgetChanged(AbstractWidget widget) throws IllegalArgumentException {
        if(widget == confirmButton) {
            resetButton.setEnabled(false);
            confirmForm(textbox.getText());
        }else if(widget == textbox) {
            resetButton.setEnabled(textbox.getText() != "");
        }else if(widget == resetButton) {
            textbox.setText("");
        }else {
            throw new IllegalArgumentException();
        }
    }

    public void confirmForm(String text) {
        System.out.println("Form confirmed with text " + text);
    }
}
