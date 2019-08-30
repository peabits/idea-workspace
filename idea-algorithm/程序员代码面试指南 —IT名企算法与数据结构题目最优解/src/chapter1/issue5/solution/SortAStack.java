package chapter1.issue5.solution;

import java.util.Stack;

public class SortAStack {

    private SortAStack() {}

    public static void sortAStackByAnotherStack(Stack<Integer> stack) {
        if (stack == null) {
            throw new RuntimeException("参数不合法！");
        }
        Stack<Integer> another = new Stack<>();
        int temp = 0;
        while (!stack.empty()) {
            temp = stack.pop();
            while (!another.empty() && another.peek() > temp) {
                stack.push(another.pop());
            }
            another.push(temp);
        }
        while (!another.empty()) {
            stack.push(another.pop());
        }
    }

}
