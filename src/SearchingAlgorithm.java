import java.util.ArrayList;

/**
 * Created by GalFleissig on 30/11/2018.
 */
public interface SearchingAlgorithm {

    // Implementation of the searching algorithm on the given array.
    // Return the index of n if n is in arr or -1 otherwise
    default int find(ArrayList<Integer> arr, int n) {
        return -1;
    }

    default int find(Graph graph, int root, int id) {
        return -1;
    }

}
