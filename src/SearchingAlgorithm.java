import java.util.ArrayList;

/**
 * Created by GalFleissig on 30/11/2018.
 */
public interface SearchingAlgorithm {

    // A method for binary search algorithm on the given array.
    // Return the index of n if n is in arr or -1 otherwise
    default int find(ArrayList<Integer> arr, int n) {
        return -1;
    }


    // A method for BFS algorithm on the given array.
    // Return the data of the node with this id if the node is in the graph or -1 otherwise
    default int find(Node root, int id) {
        return -1;
    }

}
