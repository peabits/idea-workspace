package bridge_pattern.demo;

public class Client {

    private Abstraction abstraction;
    private Implementor implementor;

    public  Client() {
        this.abstraction = new RefinedAbstraction();
        this.implementor = new ConcreteImplementorA();
    }

    public static void main(String[] args) {

        Client client = new Client();
        client.abstraction.setImplementor(client.implementor);
        client.abstraction.operation();

    }

}
