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
    System.out.print(result);

    }
}