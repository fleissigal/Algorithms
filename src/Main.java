import java.util.ArrayList;
import java.util.List;

/**
 * Created by GalFleissig on 30/11/2018.
 */
public class Main {

    public static void main(String[] args) {

//  Create an array of unsorted numbers

    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(4);
    list.add(1);
    list.add(2);
    list.add(9);
    list.add(1);
    list.add(6);
    list.add(8);
    list.add(7);
    list.add(7);
    list.add(7);
    list.add(10);
    list.add(0);
    list.add(14);
    list.add(18);
    list.add(4);
    list.add(3);
    list.add(9);

    ArrayList<Integer> arr = new ArrayList<>(list);
    System.out.print(arr + "\n");

//    System.out.print("MergeSort\n");
//    MergeSort.sort(arr);
//    System.out.print(arr.toString());

    System.out.print("QuickSort:\n");
    QuickSort quick_sort = new QuickSort();
    quick_sort.sort(arr);
    System.out.print(arr + "\n");

    int n = 10;
    System.out.printf("BinarySearch: %d\n", n);
    BinarySearch binary_search = new BinarySearch();
    int result = binary_search.find(arr, n);
    System.out.print(result + "\n");

    n = 7;

    Graph graph = new Graph();

    Node a = new Node(1, 111);
    Node b = new Node(2, 112);
    Node c = new Node(3, 113);
    Node d = new Node(4, 114);
    Node e = new Node(5, 115);
    Node f = new Node(6, 116);
    Node g = new Node(7, 117);

    graph.add_node(a);
    graph.add_node(b);
    graph.add_node(c);
    graph.add_node(d);
    graph.add_node(e);
    graph.add_node(f);
    graph.add_node(g);

    a.addLinkedNode(b);
    a.addLinkedNode(c);
    a.addLinkedNode(d);
    b.addLinkedNode(e);
    c.addLinkedNode(f);
    d.addLinkedNode(g);

    BFS bfs = new BFS();
    result = bfs.find(a, n);
    System.out.printf("BFS: %d\n", n);
    System.out.print(result + "\n");

    n = 2;

    DFS dfs = new DFS();
    result = dfs.find(a, n);
    System.out.printf("DFS: %d\n", n);
    System.out.print(result + "\n");


    // Testing Binary Tree and Orders

    BinaryTreeVertex root = new BinaryTreeVertex(1, 1);
    BinaryTreeVertex second = new BinaryTreeVertex(2, 2);
    BinaryTreeVertex third = new BinaryTreeVertex(3, 3);
    BinaryTreeVertex fourth = new BinaryTreeVertex(4, 4);
    BinaryTreeVertex fifth = new BinaryTreeVertex(5, 5);
    BinaryTreeVertex sixth = new BinaryTreeVertex(6, 6);
    BinaryTreeVertex seventh = new BinaryTreeVertex(7, 7);

    BinaryTree tree = new BinaryTree(root);

    root.setLeft(second);
    root.setRight(third);

    second.setLeft(fourth);
    second.setRight(fifth);

    third.setLeft(sixth);
    third.setRight(seventh);

    System.out.print("PreOrder:");
    tree.preorderPrint(root);
    System.out.print("\n");
    System.out.print("InOrder:");
    tree.inorderPrint(root);
    System.out.print("\n");
    System.out.print("PostOrder:");
    tree.postPrint(root);
    System.out.print("\n");

    // Testing NewGraph and BFS and DFS

        Vertex one = new Vertex(1, 1);
        Vertex two = new Vertex(2, 2);
        Vertex three = new Vertex(3, 3);
        Vertex four = new Vertex(4, 4);
        Vertex five = new Vertex(5, 5);
        Vertex six = new Vertex(6, 6);
        Vertex seven = new Vertex(7, 7);
        Vertex eight = new Vertex(8, 8);
        Vertex nine = new Vertex(9, 9);
        Vertex ten = new Vertex(10, 10);

        one.addNeighbor(four);
        one.addNeighbor(six);

        two.addNeighbor(ten);

        three.addNeighbor(four);
        three.addNeighbor(seven);
        three.addNeighbor(nine);

        four.addNeighbor(five);

        five.addNeighbor(two);

        six.addNeighbor(three);
        six.addNeighbor(nine);

        seven.addNeighbor(two);
        seven.addNeighbor(eight);

        ten.addNeighbor(eight);

        NewGraph newGraph = new NewGraph();
        newGraph.addVertex(one);
        newGraph.addVertex(two);
        newGraph.addVertex(three);
        newGraph.addVertex(four);
        newGraph.addVertex(five);
        newGraph.addVertex(six);
        newGraph.addVertex(seven);
        newGraph.addVertex(eight);
        newGraph.addVertex(nine);
        newGraph.addVertex(ten);

        System.out.print("Starting DFS:\n");
        newGraph.findDFS(one,7);

        System.out.print("\n");
        System.out.print("\n");

        System.out.print("Starting BFS:\n");
        newGraph.findBFS(one,7);


    }

}