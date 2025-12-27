package interviewground.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Orange");

        // Create a read-only view of the ArrayList
        List<String> readOnlyList = Collections.unmodifiableList(originalList);

        // Attempting to modify the read-only list will result in an UnsupportedOperationException
        //readOnlyList.add("Grapes"); // Uncommenting this line will throw an exception

        // Access elements in the read-only list
        System.out.println("Read-only list elements: " + readOnlyList);

        // Changes to the original list will be reflected in the read-only list
        originalList.add("Grapes");
        System.out.println("Read-only list after modification to the original list: " + readOnlyList);
    }
}
