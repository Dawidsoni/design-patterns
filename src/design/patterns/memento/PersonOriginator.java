package design.patterns.memento;

/**
 * Created by dawid on 12/07/16.
 */
public class PersonOriginator {
    protected PersonMemento memento;

    public void setState(String firstName, String lastName) {
        memento = new PersonMemento(firstName, lastName);
    }

    public PersonMemento getState() {
        return memento;
    }

    public void restoreState(PersonMemento memento) {
        this.memento = memento;
    }
}
