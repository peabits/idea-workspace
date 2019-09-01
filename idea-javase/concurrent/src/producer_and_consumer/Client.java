package producer_and_consumer;

public class Client {

    public static void main(String[] args) {
        Thread tp1 = new Thread(new Producer(), "生产者 1");
        Thread tp2 = new Thread(new Producer(), "生产者 2");
        Thread tc1 = new Thread(new Consumer(), "消费者 1");
        Thread tc2 = new Thread(new Consumer(), "消费者 2");
        tp1.start();
        // tp2.start();
        tc1.start();
        // tc2.start();
    }

}
