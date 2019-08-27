package adapter_pattern.demo.object_adapter_pattern;

public class Adapter implements Target {

    private Adaptee adaptee;  // 维持一个对适配者对象的引

    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();  // 转发調用
    }

}
