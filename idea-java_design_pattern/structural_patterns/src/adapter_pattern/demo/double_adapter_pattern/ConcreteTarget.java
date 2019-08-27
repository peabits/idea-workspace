package adapter_pattern.demo.double_adapter_pattern;

public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println(">>> 请求");
    }
}
