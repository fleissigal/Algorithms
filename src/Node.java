import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Created by GalFleissig on 30/11/2018.
 */

class Node {

    private int id;
    private int data;
    private Set<Node> linkedNodes;

    Node(int id, int data) {
        this.id = id;
        this.data = data;
        this.linkedNodes = Collections.emptySet();
    }

    public int getId() {
        return id;
    }

    public int getData() {
        return data;
    }

    public Set<Node> getLinkedNodes() {
        return linkedNodes;
    }

    public void addLinkedNode(Node node) {
        this.linkedNodes.add(node);
    }

}