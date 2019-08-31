package producer_and_consumer;

public class Client {

    private int resources;

    private Client() {
    }

    public int getResources() {
        return resources;
    }

    public void setResources(int resources) {
        this.resources = resources;
    }

    public static void main(String[] args) {
        Client client = new Client();
        Consumer consumer = new Consumer(client);
        Producer producer = new Producer(client);
        Thread tc = new Thread(consumer);
        Thread tp = new Thread(producer);
        tc.start();
        tp.start();


    }

}
