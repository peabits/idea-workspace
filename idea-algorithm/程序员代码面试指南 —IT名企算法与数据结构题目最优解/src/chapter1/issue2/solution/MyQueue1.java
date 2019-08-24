package chapter1.issue2.solution;

public class MyQueue1 extends AbstractMyQueue {

    public MyQueue1() {}

    @Override
    public void push(int pushNum) throws Exception {
        this.stackPush.push(pushNum);
    }

    @Override
    public int pop() throws Exception {
        if (this.stackPush.empty() && this.stackPop.empty()) {
            throw new RuntimeException("队列为空");
        }
        while (!this.stackPush.empty()) {
            this.stackPop.push(this.stackPush.pop());
        }
        return this.stackPop.pop();
    }

    @Override
    public int peek() throws Exception {
        if (this.stackPush.empty() && this.stackPop.empty()) {
            throw new RuntimeException("队列为空");
        }
        while (!this.stackPush.empty()) {
            this.stackPop.push(this.stackPush.pop());
        }
        return this.stackPop.peek();
    }

}
