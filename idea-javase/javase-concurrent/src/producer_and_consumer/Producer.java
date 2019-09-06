package producer_and_consumer;

public class Producer extends Resource implements Runnable {

    public Producer() {
    }

    @Override
    public void run() {
        while (true) {
            if (Resource.resources >= 100) {
                System.out.println(">>> 资源过多，此时资源数目 = " + Resource.resources);
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
                    System.out.println(">>> " + Thread.currentThread().getName() + " 生产一个，此时资源数目 = " + (++Resource.resources));
                }
            }
        }
    }

}
