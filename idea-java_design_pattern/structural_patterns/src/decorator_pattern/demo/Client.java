package decorator_pattern.demo;

public class Client {

    private Decorator decorator;
    private Component component;

    public Client() {
        this.component = new ConcreteComponent();
        this.decorator = new ConcreteDecorator(this.component);
    }

    public static void main(String[] args) {

        Client client = new Client();
        client.decorator.operation();

    }

}
