import java.util.HashSet;
import java.util.Queue;
import java.util.Stack;
import java.util.*;

public class NewGraph {
    private HashSet<Vertex> vertices;

    public NewGraph() {
        this.vertices = new HashSet<>();
    }

    public HashSet<Vertex> getVertices() {
        return vertices;
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public int findDFS(Vertex start, int searchId) {
//        Init a visited array
        HashSet<Vertex> visited = new HashSet<>();
//        Init a stack and insert one random vertex to it
        Stack<Vertex> stack = new Stack<>();
        stack.add(start);
//        While stack is not empty, take one out
        while (!stack.isEmpty()) {
//        If it's the one with the id, return its data and break
            Vertex next = stack.pop();
            System.out.print("Checking next: " + next.getId() + "\n");
            if (next.getId() == searchId) {
                System.out.print("Found! Data = " + next.getData());
                return next.getData();
            } else {
//        Else mark it as visited, and load its neighbors that are not in visited to the stack
                visited.add(next);
                HashSet<Vertex> neighbors = next.getNeighbors();
                for (Vertex neighbor : neighbors) {
                    if (!visited.contains(neighbor)) stack.add(neighbor);
                }
            }
        }
//        If not found, return min_value. Can throw an exception instead
        return Integer.MIN_VALUE;
    }

    public int findBFS(Vertex start, int searchId) {
//        Init a visited array
        HashSet<Vertex> visited = new HashSet<>();
//        Init a queue and insert one random vertex to it
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(start);
//        While queue is not empty, take one out
        while (!queue.isEmpty()) {
//        If it's the one with the id, return its data and break
            Vertex next = queue.remove();
            System.out.print("Checking next: " + next.getId() + "\n");
            if (next.getId() == searchId) {
                System.out.print("Found! Data = " + next.getData());
                return next.getData();
            } else {
//        Else mark it as visited, and load its neighbors that are not in visited to the queue
                visited.add(next);
                HashSet<Vertex> neighbors = next.getNeighbors();
                for (Vertex neighbor : neighbors) {
                    if (!visited.contains(neighbor)) queue.add(neighbor);
                }
            }
        }
//        If not found, return min_value. Can throw an exception instead
        return Integer.MIN_VALUE;

    }
}