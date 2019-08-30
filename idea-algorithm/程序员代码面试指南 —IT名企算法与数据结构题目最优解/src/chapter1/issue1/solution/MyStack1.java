package chapter1.issue1.solution;

public class MyStack1 extends AbstractMyStack {

    @Override
    public void push(int newNum) throws Exception {
        if (this.stackMin.isEmpty() || newNum <= this.getMin()) {  // 不能写成 newNum < this.getMin()
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    @Override
    public int pop() throws Exception {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        if (this.stackData.peek() == this.getMin()) {
            this.stackMin.pop();
        }
        return this.stackData.pop();
    }

    @Override
    public int getMin() throws Exception {
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        return this.stackMin.peek();
    }

}
