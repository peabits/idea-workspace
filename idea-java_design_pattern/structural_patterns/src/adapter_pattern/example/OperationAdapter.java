package adapter_pattern.example;

public class OperationAdapter implements ScoreOperation {

    private QuickSort sort;
    private BinarySearch search;

    public OperationAdapter() {
        sort = new QuickSort();
        search = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sort.quickSort(array);
    }

    @Override
    public int search(int[] array, int target) {
        return search.binarySearch(array, target);
    }

}
