import java.util.ArrayList;
import java.util.List;

/**
 * Created by GalFleissig on 30/11/2018.
 */

class MergeSort implements SortingAlgorithm {


    static void sort(ArrayList<Integer> arr) {

        // Checking for the base cases
        if (arr.size() == 1) {
            return;
        } else if (arr.size() == 2) {
            if (arr.get(0) < arr.get(1)) return;
            int tmp = arr.get(1);
            arr.set(1, arr.get(0));
            arr.set(0, tmp);
            return;
        }

        int middle = arr.size() / 2;

        ArrayList<Integer> firstHalf = new ArrayList<>(arr.subList(0, middle));
        ArrayList<Integer> secondHalf = new ArrayList<>(arr.subList(middle, arr.size()));

        // The recursive calls

        sort(firstHalf);
        sort(secondHalf);

        // The merging step

        List<Integer> list = new ArrayList<>();
        int firstIndex = 0;
        int secondIndex = 0;

        while ((firstIndex < firstHalf.size()) && (secondIndex < secondHalf.size())) {

            int firstInt = firstHalf.get(firstIndex);
            int secondInt = secondHalf.get(secondIndex);

            if (firstInt < secondInt) {
                list.add(firstInt);
                firstIndex++;
            } else {
                list.add(secondInt);
                secondIndex++;
            }
        }

        if (firstIndex == firstHalf.size()) {
//            Populate the rest from secondHalf
            for (int i = secondIndex; i < secondHalf.size(); i++) {
                list.add(secondHalf.get(i));
            }
        } else {
//            Populate the rest from firstHalf
            for (int i = firstIndex; i < firstHalf.size(); i++) {
                list.add(firstHalf.get(i));
            }
        }

        arr.clear();
        arr.addAll(list);
    }

}