package chapter1.issue5.test;

import chapter1.issue5.solution.SortAStack;

import java.util.Iterator;
import java.util.Stack;

public class SortAStackTest {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        stack.add(3);
        stack.add(1);
        stack.add(5);
        stack.add(4);
        SortAStack.sortAStackByAnotherStack(stack);

        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("————————————————————");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

}
