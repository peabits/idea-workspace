package adapter_pattern.demo.default_adapter_pattern;

public class Client {

    ServiceInterface service;

    public Client() {
        this.service = new ConcreteServiceClass();
    }

    public static void main(String[] args) {

        Client client = new Client();
        client.service.serviceMethod1();

    }

}
