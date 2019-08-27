package adapter_pattern.demo.object_adapter_pattern;

public class Client {

    Target target;

    public Client(Adaptee adaptee) {
        this.target = new Adapter(adaptee);
    }

    public static void main(String[] args) {

        Client client = new Client(new Adaptee());
        client.target.request();;

    }

}
