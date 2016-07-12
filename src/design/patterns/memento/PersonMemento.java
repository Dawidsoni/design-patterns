package design.patterns.memento;

/**
 * Created by dawid on 12/07/16.
 */
public class PersonMemento {
    protected String firstName, lastName;

    PersonMemento(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
