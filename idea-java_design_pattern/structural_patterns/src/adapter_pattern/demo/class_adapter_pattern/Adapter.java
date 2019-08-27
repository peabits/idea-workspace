package adapter_pattern.demo.class_adapter_pattern;

public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        this.specificRequest();
    }

}
