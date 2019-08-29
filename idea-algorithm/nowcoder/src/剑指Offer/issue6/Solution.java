package 剑指Offer.issue6;

import java.util.ArrayList;

public class Solution {

    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int minNum = array[0];
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        return minNum;
    }

}