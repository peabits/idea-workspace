package lambda_expression;

public class LambdaExpressionDemo {

    public static void main(String[] args) {

        func1(() -> System.out.println(">>> 拉姆达表达式方法实现"));

        func2(new IAbstractClass() {
            @Override
            public void function() {
                System.out.println(">>> 匿名内部类方法实现");
            }
        });

        func3(new IClass());

    }

    private static void func1(IInterface iInterface) {
        iInterface.function();
    }

    private static void func2(IAbstractClass iAbstractClass) {
        iAbstractClass.function();
    }

    private static void func3(IClass iClass) {
        iClass.function();
    }

}
