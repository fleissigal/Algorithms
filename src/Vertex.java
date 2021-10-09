import java.util.HashSet;

public class Vertex {
    private int id;
    private int data;
    private HashSet<Vertex> neighbors;

    public Vertex(int id, int data) {
        this.id = id;
        this.data = data;
        neighbors = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public int getData() {
        return data;
    }

    public HashSet<Vertex> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Vertex node) {
        neighbors.add(node);
    }


}
