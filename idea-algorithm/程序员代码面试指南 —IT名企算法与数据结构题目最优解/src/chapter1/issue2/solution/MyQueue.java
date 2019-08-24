package chapter1.issue2.solution;

public interface MyQueue {

    /**
     * 入队
     *
     * @param pushNum 新数据插入队尾
     * @throws Exception
     */
    void push(int pushNum) throws Exception;

    /**
     * 出队
     *
     * @return 队首元素出队
     * @throws Exception
     */
    int pop() throws Exception;

    /**
     * 获取队首元素
     *
     * @return 返回队首元素
     * @throws Exception
     */
    int peek() throws Exception;

}
