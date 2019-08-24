package chapter1.issue1.solution;

import java.util.Stack;

public abstract class AbstractMyStack implements MyStack {

    protected Stack<Integer> stackData;
    protected Stack<Integer> stackMin;

    public AbstractMyStack() {
        stackData = new Stack<>();
        stackMin = new Stack<>();
    }

}
