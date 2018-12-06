import java.util.*;

/**
 * Created by GalFleissig on 30/11/2018.
 */

class BFS implements SearchingAlgorithm {

    // TODO: add visited and queue as fields here and remove the aux method


    // Return the value of the node with id if the node is in the graph,
    // else return -1. We start at node root
    @Override
    public int find(Node root, int id) {

        Set<Integer> visited = new HashSet<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            if (queue.peek().getId() == id) return queue.peek().getData();
            Node curr = queue.remove();
            visited.add(curr.getId());
            for (Node n : curr.getLinkedNodes()) {
                if (!visited.contains(n.getId()) && !queue.contains(n)) {
                    queue.add(n);
                }
            }
        }
        return -1;

    }
}