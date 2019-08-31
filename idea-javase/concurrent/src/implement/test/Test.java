package implement.test;

import implement.callable.MyThreadImplCallable;
import implement.runnable.MyThreadImplRunnable;
import implement.thread.MyThreadImplThread;

import java.util.concurrent.FutureTask;

public class Test {

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThreadImplThread(), "Thread 实现");
        Thread t2 = new Thread(new MyThreadImplRunnable(), "Runnable 实现");
        Thread t3 = new Thread(new FutureTask<Integer>(new MyThreadImplCallable()), "Callable 实现");
        Thread t4 = new Thread(() -> {
            for(int i = 0; i < 10; ++i) {
                System.out.println("线程 " + Thread.currentThread().getName() + " -> " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "lambda 实现");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}
