package implement.thread;

public class MyThreadImplThread extends Thread {

    @Override
    public void run() {

        for(int i = 0; i < 10; ++i) {
            System.out.println("线程 " + Thread.currentThread().getName() + " -> " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
