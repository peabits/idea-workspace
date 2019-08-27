package adapter_pattern.demo.double_adapter_pattern;

public class Adapter implements Target, Adaptee {

    Target target;
    Adaptee adaptee;

    public Adapter(Target target) {
        this.target = target;
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }

    @Override
    public void specificRequest() {
        this.target.request();
    }

}
