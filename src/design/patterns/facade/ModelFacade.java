package design.patterns.facade;

/**
 * Created by dawid on 11/07/16.
 */
public class ModelFacade {
    private SubModelA modelA = new SubModelA();
    private SubModelB modelB = new SubModelB();
    private SubModelC modelC = new SubModelC();

    public void operationA() {
        modelA.operationB();
        modelB.operationA();
        modelC.operationA();
    }

    public void operationB() {
        modelB.operationB();
        modelB.operationA();
        modelC.operationB();
    }

}

