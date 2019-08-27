package bridge_pattern.demo;

public abstract class Abstraction {

    protected Implementor implementor;  // 定义实现类接口对象

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();  // 声明抽象业务方法

}
