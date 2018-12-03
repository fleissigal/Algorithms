import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GalFleissig on 30/11/2018.
 */

class Node {

    int id;
    int data;
    ArrayList<Integer> links;

    Node(int id, int data) {
        this.id = id;
        this.data = data;
        this.links = new ArrayList<>();
    }



}