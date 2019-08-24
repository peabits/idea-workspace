package chapter1.issue3.solution;

import java.util.Stack;

public class ReverseAStack {

    private ReverseAStack() {
    }

    public static void reverseAStack(Stack<Integer> stack) throws Exception {
        if (stack == null) {
            throw new RuntimeException("参数不合法");
        }
        reverse(stack);
    }

    private static void reverse(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        int last = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(last);
    }

    private static int getAndRemoveLastElement(Stack<Integer> stack) {
        int next = stack.pop();
        if (stack.empty()) {
            return next;
        }
        int last = getAndRemoveLastElement(stack);
        stack.push(next);
        return last;
    }

}
