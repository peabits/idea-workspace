package chapter2.issue1.test;

import chapter2.issue1.solution.TwoLinkedListCommonPart;

import java.util.List;

public class TwoLinkedListCommonPartTest {

    public static void main(String[] args) {

        int[] arr1 = {6, 5, 4, 3, 2};
        int[] arr2 = {4, 3, 2, 1, 0};

        TwoLinkedListCommonPart instance = new TwoLinkedListCommonPart(arr1, arr2);
        List<Integer> common = instance.getCommon();

    }

}
