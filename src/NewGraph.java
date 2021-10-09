import java.util.HashSet;

public class NewGraph {
    private HashSet<Vertex> vertices;
    private HashSet<Edge> edges;

    public NewGraph() {
        this.vertices = new HashSet<>();
        this.edges = new HashSet<>();
    }

    public HashSet<Vertex> getVertices() {
        return vertices;
    }

    public HashSet<Edge> getEdges() {
        return edges;
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void addEdge(Edge e) {
        edges.add(e);
    }

    public HashSet<Vertex> getNeighbors(Vertex v) {
        HashSet<Vertex> result = new HashSet<>();
        for (Edge e : edges) {
            if (e.getFrom().equals(v)) result.add(e.getTo());
        }
        return result;
    }
}