package adapter_pattern.demo.double_adapter_pattern;

public class Client {

    Target target;
    Adaptee adaptee;

    public Client() {
        this.target = new Adapter(new ConcreteAdaptee());
        this.adaptee = new Adapter(new ConcreteTarget());
    }

    public static void main(String[] args) {

        Client client = new Client();
        client.target.request();
        client.adaptee.specificRequest();

    }


}
