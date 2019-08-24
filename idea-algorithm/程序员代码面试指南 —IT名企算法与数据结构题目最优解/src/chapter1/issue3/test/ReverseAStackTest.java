package chapter1.issue3.test;

import chapter1.issue3.solution.ReverseAStack;

import java.util.Stack;

public class ReverseAStackTest {

    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        ReverseAStack.reverseAStack(stack);

    }

}
