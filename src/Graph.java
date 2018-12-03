import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;

/**
 * Created by GalFleissig on 30/11/2018.
 */

class Graph {

    ArrayList<Node> nodes;
    ArrayList<Link> links;

    Graph() {}

    public void add_node(Node node) {
        nodes.add(node);
    }

    public void add_link(Link link) {
        this.links.add(link);
    }
}