package api;

public class RuntimeImpl {

    public static void main(String[] args) throws InterruptedException {
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.availableProcessors());
        System.out.println(rt.maxMemory());
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
        System.out.println(rt.totalMemory() - rt.freeMemory());
        System.out.println("————————————————————");
        for (int i = 0; i < 100000; ++i) {
            String s = new String("hello");
        }
        System.out.println(rt.maxMemory());
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
        System.out.println(rt.totalMemory() - rt.freeMemory());
        System.out.println("————————————————————");
        rt.gc();
        System.out.println(rt.maxMemory());
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
        System.out.println(rt.totalMemory() - rt.freeMemory());
        System.out.println("————————————————————");
        Thread.sleep(1000);
        System.out.println(rt.maxMemory());
        System.out.println(rt.totalMemory());
        System.out.println(rt.freeMemory());
        System.out.println(rt.totalMemory() - rt.freeMemory());
        System.out.println("————————————————————");

    }

}
