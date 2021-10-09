import java.util.HashSet;

public class BinaryTree {
    private BinaryTreeVertex root;
    private HashSet<BinaryTreeVertex> vertices;
    private HashSet<BinaryTreeEdge> edges;

    public BinaryTree(BinaryTreeVertex root) {
        this.root = root;
        this.vertices = new HashSet<>();
        this.edges = new HashSet<>();
    }

    public BinaryTreeVertex getRoot() {
        return root;
    }

    public void preorderPrint(BinaryTreeVertex v) {
        if (v == null) return;
        System.out.print("ID: " + v.getId() + ", DATA: " + v.getData() + "\n");
        preorderPrint(v.getLeft());
        preorderPrint(v.getRight());
    }

    public void inorderPrint(BinaryTreeVertex v) {
        if (v == null) return;
        inorderPrint(v.getLeft());
        System.out.print("ID: " + v.getId() + ", DATA: " + v.getData() + "\n");
        inorderPrint(v.getRight());
    }

    public void postPrint(BinaryTreeVertex v) {
        if (v == null) return;
        postPrint(v.getLeft());
        postPrint(v.getRight());
        System.out.print("ID: " + v.getId() + ", DATA: " + v.getData() + "\n");
    }
}
