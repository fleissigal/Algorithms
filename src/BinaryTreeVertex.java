
public class BinaryTreeVertex {
    private int id;
    private int data;
    private BinaryTreeVertex left;
    private BinaryTreeVertex right;

    public BinaryTreeVertex(int id, int data) {
        this.id = id;
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getId() {
        return id;
    }

    public int getData() {
        return data;
    }

    public BinaryTreeVertex getLeft() { return left; }

    public BinaryTreeVertex getRight() { return right; }

    public void setLeft(BinaryTreeVertex v) {
        this.left = v;
    }

    public void setRight(BinaryTreeVertex v) {
        this.right = v;
    }

}
