package chapter2.issue3.test;

import chapter2.issue3.solution.RemoveByRatio;
import chapter2.issue3.solution.RemoveMidNode;

public class Test {

    private RemoveMidNode mid;
    private RemoveByRatio ratio;

    public Test(int[] arr) {
        this.mid = new RemoveMidNode(arr);
        this.ratio = new RemoveByRatio(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Test test = new Test(arr);
        test.mid.removeMidNode();
        test.ratio.removeByRatio(3, 5);

    }

}
