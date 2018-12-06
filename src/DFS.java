import java.util.*;

/**
 * Created by GalFleissig on 30/11/2018.
 */

class DFS implements SearchingAlgorithm {

    // TODO: add visited and queue as fields here and remove the aux method


    // Return the value of the node with id if the node is in the graph,
    // else return -1. We start at node root
    @Override
    public int find(Node root, int id) {

        Set<Integer> visited = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            if (stack.peek().getId() == id) return stack.peek().getData();
            Node curr = stack.pop();
            visited.add(curr.getId());
            for (Node n : curr.getLinkedNodes()) {
                if (!visited.contains(n.getId()) && !stack.contains(n)) {
                    stack.push(n);
                }
            }
        }
        return -1;

    }
}