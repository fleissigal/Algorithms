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

    ArrayList<Integer> arr = new ArrayList<>(list);

//  Sort the elements of the array

    MergeSort.sort(arr);

//  Print the result to console

    System.out.print(arr.toString());

    }
}
