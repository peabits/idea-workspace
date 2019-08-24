package chapter1.issue2.test;

import chapter1.issue2.solution.MyQueue;
import chapter1.issue2.solution.MyQueue1;
import chapter1.issue2.solution.MyQueue2;

public class MyQueueTest {

    public static void main(String[] args) throws Exception {

        MyQueue queue1 = new MyQueue1();
        MyQueue queue2 = new MyQueue2();
        test(queue1);
        test(queue2);

    }

    private static void test(MyQueue queue) throws Exception {
        if (queue == null) {
            throw new RuntimeException("参数不合法！");
        }
        int popNum = -1;
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        popNum = queue.pop();
        queue.push(5);
        popNum = queue.pop();
        queue.push(6);
        popNum = queue.pop();
        queue.push(7);
        popNum = queue.pop();
        queue.push(8);
        popNum = queue.pop();
        queue.push(9);
    }

}
