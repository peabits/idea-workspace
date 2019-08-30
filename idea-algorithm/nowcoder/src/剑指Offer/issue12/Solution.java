package 剑指Offer.issue12;

/**
 * 题目描述：
 * 给定一个 double 类型的浮点数 base 和 int 类型的整数 exponent。求 base 的 exponent 次方。
 * 保证 base 和 exponent 不同时为 0
 */
public class Solution {
    public double Power(double base, int exponent) {
        double num = 1;
        for (int i = 1; i <= Math.abs(exponent); ++i) {
            num *= base;
        }
        return exponent > 0 ? num : 1 / num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        double num = solution.Power(0.1,5);
        num = solution.Power(0.1,-5);

    }

}
