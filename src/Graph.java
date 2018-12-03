import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/**
 * Created by GalFleissig on 30/11/2018.
 */

class Graph {

    Set<Node> nodes;
    Set<Link> links;

    Graph() {
        this.nodes = Collections.emptySet();
        this.links = Collections.emptySet();
    }

    public void add_node(Node node) {
        nodes.add(node);
    }

    public void add_link(Link link) {
        this.links.add(link);
    }
}