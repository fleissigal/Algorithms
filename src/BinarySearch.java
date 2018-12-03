import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by GalFleissig on 30/11/2018.
 */

class BinarySearch implements SearchingAlgorithm {


    public int find(ArrayList<Integer> arr, int n) {

        return find_aux(arr, n, 0, arr.size() - 1);

    }

    public int find_aux(ArrayList<Integer> arr, int n, int leftHand, int rightHand) {

        // Checking for the base cases

        int diff = rightHand - leftHand;

        if (diff == 0) {
            return (arr.get(leftHand) == n) ? leftHand : -1;
        } else if (diff == 1) {
            if (arr.get(leftHand) == n) {
                return leftHand;
            } else if (arr.get(rightHand) == n) {
                return rightHand;
            } else {
                return -1;
            }
        }

        int middleIndex = leftHand + (diff / 2);

        if (n < arr.get(middleIndex)) {
            rightHand = middleIndex;
        } else {
            leftHand = middleIndex;
        }

        return find_aux(arr, n, leftHand, rightHand);

    }

}