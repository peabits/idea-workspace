package producer_and_consumer;

public class Consumer extends Resource implements Runnable {

    public Consumer() {
    }

    @Override
    public void run() {
        while (true) {
            if (Resource.resources <= 0) {
                System.out.println(">>> 资源紧缺，此时资源数目 = " + Resource.resources);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                synchronized (this) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(">>> " + Thread.currentThread().getName() + " 消费一个，此时资源数目 = " + (--Resource.resources));

                }
            }
        }
    }

}
