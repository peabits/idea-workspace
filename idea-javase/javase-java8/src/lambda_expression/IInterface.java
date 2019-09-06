package lambda_expression;

@FunctionalInterface
public interface IInterface {

    public abstract void function();

    // void f1();

    public default void defaultFunction() {
        System.out.println(">>> 默认方法实现");
    }

    public static void staticFunction() {
        System.out.println(">>> 静态方法实现");
    }

}
