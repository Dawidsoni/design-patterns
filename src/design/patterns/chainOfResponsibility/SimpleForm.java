package design.patterns.chainOfResponsibility;

/**
 * Created by dawid on 09/07/16.
 */
public class SimpleForm extends AbstractForm {

    public SimpleForm() {}

    public SimpleForm(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    @Override
    public String getHelp() {
        if(this.helpMessage == "") {
            return this.parentForm.getHelp();
        }
        return this.helpMessage;
    }

}
