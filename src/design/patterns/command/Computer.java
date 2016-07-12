package design.patterns.command;

/**
 * Created by dawid on 12/07/16.
 */
class Computer {
    protected int value;

    void compute(char operator, int operand) {
        switch (operator) {
            case '+':
                value += operand;
                break;
            case '-':
                value -= operand;
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int getValue() {
        return value;
    }
}
