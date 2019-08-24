package chapter1.issue2.solution;

public class MyQueue2 extends AbstractMyQueue {

    public MyQueue2() {}

    @Override
    public void push(int pushNum) throws Exception {
        while (!this.stackPop.empty()) {
            this.stackPush.push(this.stackPop.pop());
        }
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
