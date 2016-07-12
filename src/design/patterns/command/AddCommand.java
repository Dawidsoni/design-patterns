package design.patterns.command;

/**
 * Created by dawid on 12/07/16.
 */
class AddCommand implements ICommand {
    protected Computer computer;
    protected int operand;

    AddCommand(Computer computer, int operand) {
        this.computer = computer;
        this.operand = operand;
    }

    @Override
    public void execute() {
        computer.compute('+', operand);
    }

    @Override
    public void unexecute() {
        computer.compute('-', operand);
    }
}
