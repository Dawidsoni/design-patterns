package design.patterns.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dawid on 09/07/16.
 */
public class AlertForm extends AbstractForm {

    public AlertForm(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    @Override
    public String getHelp() {
        return this.helpMessage;
    }

}
