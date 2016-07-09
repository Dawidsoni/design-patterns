package design.patterns.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dawid on 09/07/16.
 */
public abstract class AbstractForm {
    protected String helpMessage = "";
    AbstractForm parentForm;
    List<AbstractForm> formList = new ArrayList<AbstractForm>();

    public void addForm(AbstractForm form) {
        form.parentForm = this;
        formList.add(form);
    }

    public abstract String getHelp();
}
