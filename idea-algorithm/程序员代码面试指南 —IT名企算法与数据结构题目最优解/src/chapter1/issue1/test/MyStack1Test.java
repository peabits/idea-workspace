package chapter1.issue1.test;

import chapter1.issue1.solution.MyStack;
import chapter1.issue1.solution.MyStack1;
import chapter1.issue1.solution.MyStack2;

public class MyStack1Test {

    public static void main(String[] args) throws Exception {

        MyStack stack1 = new MyStack1();
        MyStack stack2 = new MyStack2();

        test(stack1);
        test(stack2);

    }

    private static void test(MyStack stack) throws Exception {
        if (stack == null) {
            throw new RuntimeException("参数不合法！");
        }
        stack.push(3);
        stack.getMin();
        stack.push(4);
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(1);
        stack.getMin();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.getMin();
        stack.pop();
    }

}
