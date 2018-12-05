import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by GalFleissig on 30/11/2018.
 */

class Node {

    private int id;
    private int data;
    private Set<Node> neighbours;

    Node(int id, int data) {
        this.id = id;
        this.data = data;
        this.neighbours = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public int getData() {
        return data;
    }

    public Set<Node> getLinkedNodes() {
        return neighbours;
    }

    public void addLinkedNode(Node node) {
        this.neighbours.add(node);
    }

}