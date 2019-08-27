package adapter_pattern.demo.double_adapter_pattern;

public class ConcreteAdaptee implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println(">>> 特殊请求");
    }
}
