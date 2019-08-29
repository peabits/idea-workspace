package 剑指Offer.issue9;

/**
 * 题目描述：
 * 一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级……它也可以跳上 n 级。
 * 求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class Solution {
    public int JumpFloorII(int target) {
        if (target < 1) {
            return 0;
        }
        int[] tab = new int[target + 1];
        tab[0] = 1;
        for (int i = 1; i <= target; ++i) {
            for (int j = 0; j < i; ++j) {
                tab[i] += tab[j];
            }
        }

//        tab[1] = 1;
//        for (int i = 1; i <= target; ++i) {
//            tab[i] = 2 * tab[i - 1];
//        }

//        return 1 << (target - 1);

        return tab[target];
    }
}
