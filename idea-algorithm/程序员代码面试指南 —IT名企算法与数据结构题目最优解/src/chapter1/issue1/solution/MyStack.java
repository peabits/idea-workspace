package chapter1.issue1.solution;

public interface MyStack {

    /**
     * 入栈
     *
     * @param newNum 压入堆栈
     * @throws Exception 栈为空
     */
    void push(int newNum) throws Exception;

    /**
     * 出栈
     *
     * @return 弹出堆栈
     * @throws Exception 栈为空
     */
    int pop() throws Exception;

    /**
     * 获得栈中最小元素
     *
     * @return 栈中最小元素
     * @throws Exception 栈为空
     */
    int getMin() throws Exception;

}
