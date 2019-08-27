package bridge_pattern.demo;

public class ConcreteImplementorA implements Implementor {

    @Override
    public void operationImpl() {
        System.out.println(">>> ConcreteImplementorA -> operationImpl");
    }

}
