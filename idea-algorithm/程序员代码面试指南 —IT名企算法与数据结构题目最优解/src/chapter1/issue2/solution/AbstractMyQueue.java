package chapter1.issue2.solution;

import java.util.Stack;

public abstract class AbstractMyQueue implements MyQueue {

    protected Stack<Integer> stackPush;
    protected Stack<Integer> stackPop;

    protected AbstractMyQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

}
