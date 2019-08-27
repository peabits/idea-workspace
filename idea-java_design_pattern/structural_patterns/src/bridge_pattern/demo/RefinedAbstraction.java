package bridge_pattern.demo;

public class RefinedAbstraction extends Abstraction {

    @Override
    public void operation() {
        // 业务代码
        this.implementor.operationImpl();  // 调用实现类的方法
        // 业务代码
    }

}
