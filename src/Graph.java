import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by GalFleissig on 30/11/2018.
 */

class Graph {

    Set<Node> nodes;

    Graph() {
        this.nodes = new HashSet<>();
    }

    public void add_node(Node node) {
        nodes.add(node);
    }

    public void add_link(Node n1, Node n2) {
        n1.addLinkedNode(n2);
        n2.addLinkedNode(n1);
    }
}