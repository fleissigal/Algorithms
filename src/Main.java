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
    System.out.print(arr.toString() + "\n");

//    System.out.print("MergeSort\n");
//    MergeSort.sort(arr);
//    System.out.print(arr.toString());

    System.out.print("QuickSort:\n");
    QuickSort quick_sort = new QuickSort();
    quick_sort.sort(arr);
    System.out.print(arr.toString() + "\n");

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
    }

}