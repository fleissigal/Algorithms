
public class BinaryTreeEdge {
    private BinaryTreeVertex from;
    private BinaryTreeVertex to;

    public BinaryTreeEdge(BinaryTreeVertex from, BinaryTreeVertex to) {
        this.from = from;
        this.to = to;
    }

    public BinaryTreeVertex getFrom() {
        return from;
    }

    public BinaryTreeVertex getTo() {
        return to;
    }

}
