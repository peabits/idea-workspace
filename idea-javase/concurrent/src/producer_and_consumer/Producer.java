package producer_and_consumer;

public class Producer implements Runnable {

    Client client;

    public Producer(Client client) {
        this.client = client;
    }

    @Override
    public void run() {
        while (true) {
            if (this.client.getResources() >= 100) {
                System.out.println(">>> 生产过量");
            } else {
                synchronized (this) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.client.setResources(this.client.getResources()+1);
                    for (int i = 0; i < this.client.getResources(); ++i) {
                        System.out.print("*");
                    }
                    for (int i = 0; i < 100 - this.client.getResources(); ++i) {
                        System.out.print("-");
                    }
                    System.out.println();
                }
            }
        }
    }

}
