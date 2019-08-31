package implement.callable;

import java.util.concurrent.Callable;

    public class MyThreadImplCallable implements Callable {

    @Override
    public Object call() throws Exception {
        for(int i = 0; i < 10; ++i) {
            System.out.println("线程 " + Thread.currentThread().getName() + " -> " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
