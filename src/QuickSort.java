import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by GalFleissig on 30/11/2018.
 */

class QuickSort implements SortingAlgorithm {


    static void sort(ArrayList<Integer> arr) {


        // Checking for the base cases
        if (arr.size() == 0 || arr.size() == 1) { // The array is already sorted
            return;
        }

        // Picking the pivot element
        int pivotIndex = ThreadLocalRandom.current().nextInt(0, arr.size() - 1);

        int pivotNum = arr.get(pivotIndex);

        ArrayList<Integer> smallerThanPivot = new ArrayList<>();
        ArrayList<Integer> largerThanPivot = new ArrayList<>();

        for (int i = 0; i < pivotIndex; i++) {
            int iElement = arr.get(i);
            if (iElement < pivotNum) {
                smallerThanPivot.add(iElement);
            } else {
                largerThanPivot.add(iElement);
            }
        }

        for (int i = pivotIndex + 1; i < arr.size(); i++) {
            int iElement = arr.get(i);
            if (iElement < pivotNum) {
                smallerThanPivot.add(iElement);
            } else {
                largerThanPivot.add(iElement);
            }
        }

        // Merging the two arrays with the pivotNum

        sort(smallerThanPivot);
        sort(largerThanPivot);

        arr.clear();
        arr.addAll(smallerThanPivot);
        arr.add(pivotNum);
        arr.addAll(largerThanPivot);

    }

}