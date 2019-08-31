package producer_and_consumer;

public class Consumer implements Runnable {

    Client client;

    public Consumer(Client client) {
        this.client = client;
    }

    @Override
    public void run() {
        while (true) {
            if (this.client.getResources() <= 0) {
                System.out.println(">>> 资源紧缺");
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
