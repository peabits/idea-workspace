package 剑指Offer.issue10;

public class Solution {

    public int RectCover(int target) {
        if (target < 0) {
            return 0;
        }
        int[] tab = new int[target + 3];
        tab[0] = 0;
        tab[1] = 1;
        tab[2] = 2;
        for (int i = 3; i <= target; ++i) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        return tab[target];
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int r = s.RectCover(1);
    }

}