package chapter1.issue6.test;

import chapter1.issue6.solution.Hanoi;

public class HanoiTest {

    public static void main(String[] args) {
        final String left = "left";
        final String mid = "mid";
        final String right = "right";
        int num = 5;
        Hanoi.recursionImpl(num, left, mid, right);
        System.out.println("————————————————————————————————————————");
        Hanoi.stackImpl(num, left, mid, right);
    }

}
