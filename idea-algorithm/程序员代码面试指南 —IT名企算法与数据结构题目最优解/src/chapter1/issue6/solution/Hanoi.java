package chapter1.issue6.solution;

import java.util.Objects;
import java.util.Stack;

public class Hanoi {

    private Hanoi() {}

    public static int recursionImpl(int num, final String left, final String mid, final String right) {
        if (num < 1) {
            return 0;
        }
        return recursion(num, left, mid, right, left, right);
    }

    private static int recursion(int num, final String left, final String mid, final String right, String from, String to) {
        if (Objects.equals(from, to)) {
            return 0;
        }
        if (num == 1) {
            if (Objects.equals(from, mid) || Objects.equals(to, mid)) {
                System.out.println("Move 1 from " + from + " to " + to);
                return 1;
            } else {
                System.out.println("Move 1 from " + from + " to " + mid);
                System.out.println("Move 1 from " + mid + " to " + to);
                return 2;
            }
        } else {
            if (Objects.equals(from, mid) || Objects.equals(to, mid)) {
                String another = (Objects.equals(from, left) || Objects.equals(to, left)) ? right : left;
                int step1 = recursion(num - 1, left, mid, right, from, another);
                int step2 = 1;
                System.out.println("Move 1 from " + from + " to " + to);
                int step3 = recursion(num - 1, left, mid, right, another, to);
                return step1 + step2 + step3;
            } else {
                int step1 = recursion(num - 1, left, mid, right, from, to);
                int step2 = 1;
                System.out.println("Move 1 from " + from + " to " + mid);
                int step3 = recursion(num - 1, left, mid, right, to, from);
                int step4 = 1;
                System.out.println("Move 1 from " + mid + " to " + to);
                int step5 = recursion(num - 1, left, mid, right, from, to);
                return step1 + step2 + step3 + step4 + step5;
            }
        }

    }

    private static enum Action {
        NO, L2M, M2L, M2R, R2M
    }

    public static int stackImpl(int num, final String left, final String mid, final String right) {
        final Stack<Integer> LS = new Stack<>();
        final Stack<Integer> MS = new Stack<>();
        final Stack<Integer> RS = new Stack<>();
        LS.push(Integer.MAX_VALUE);
        MS.push(Integer.MAX_VALUE);
        RS.push(Integer.MAX_VALUE);
        for (int i = num; i > 0; --i) {
            LS.push(i);
        }
        Action[] record = { Action.NO };
        int step = 0;
        while (RS.size() != num + 1) {
            step += move(record, Action.M2L, Action.L2M, LS, MS, left, mid);
            step += move(record, Action.L2M, Action.M2L, MS, LS, mid, left);
            step += move(record, Action.R2M, Action.M2R, MS, RS, mid, right);
            step += move(record, Action.M2R, Action.R2M, RS, MS, right, mid);
        }
        return step;
    }

    private static int move(Action[] pre, Action no, Action now, final Stack<Integer> FS, final Stack<Integer> TS, String from, String to) {
        if (!Objects.equals(pre[0], no) && FS.peek() < TS.peek()) {
            TS.push(FS.pop());
            System.out.println("Move 1 from " + from + " to " + to);
            pre[0] = now;
            return 1;
        }
        return 0;
    }

}
