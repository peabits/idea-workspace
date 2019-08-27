package adapter_pattern.demo.class_adapter_pattern;

public class Client {

    Target target;

    public Client() {
        this.target = new Adapter();
    }

    public static void main(String[] args) {

        Client client = new Client();
        client.target.request();

    }

}
