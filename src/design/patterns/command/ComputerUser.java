package design.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dawid on 12/07/16.
 */
public class ComputerUser {
    Computer computer = new Computer();
    List<ICommand> commandList = new ArrayList<>();

    public void compute(char operator, int operand) {
        ICommand command;
        switch (operator) {
            case '+':
                command = new AddCommand(computer, operand);
                break;
            case '-':
                command = new SubCommand(computer, operand);
                break;
            default:
                throw new IllegalArgumentException();
        }
        command.execute();
        commandList.add(command);
    }

    public void undo() {
        int lastIndex = commandList.size() - 1;
        commandList.get(lastIndex).unexecute();
        commandList.remove(lastIndex);
    }

    public int getValue() {
        return computer.getValue();
    }

}
