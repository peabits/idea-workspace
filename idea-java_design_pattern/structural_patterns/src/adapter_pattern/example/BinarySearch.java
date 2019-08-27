package adapter_pattern.example;

import java.util.Arrays;

public class BinarySearch {

    int binarySearch(int[] array, int target) {
        // return Arrays.binarySearch(array, target);
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low +high) / 2;
            if (array[mid] > target) {
                high = mid - 1;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
