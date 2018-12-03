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

        Set<Node> visited = Collections.emptySet();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        return find_aux(root, id, visited, queue);

    }

    public int find_aux(Node root, int id, Set<Node> visited, Queue<Node> queue) {

        // TODO: Check if visited is redundant

        // Checking the base case
        if (root.getId() == id) {
            return root.getData();
        }

        if (queue.isEmpty()) return -1;

        // Add root's neighbours to the queue
        visited.add(root);
        queue.remove();

        Set<Node> neighbours = root.getLinkedNodes();

        for (Node n : neighbours) {
            if (!visited.contains(n) && !queue.contains(n)) {
                queue.add(n);
            }
        }
        return find_aux(queue.peek(), id, visited, queue);

    }



}