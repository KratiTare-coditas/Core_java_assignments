package Assignment17;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Question3 {
    public static void main(String[] args) {
        TreeSet<String> treeset = new TreeSet<String>();

        // Adding elements to TreeSet object
        treeset.add("Krati");
        treeset.add("Shreya");
        treeset.add("Harini");

        // Displaying TreeSet elements
        System.out.println("Printing TreeSet elements: "+ treeset);

        // Converting TreeSet to HashSet using Constructor
        HashSet<String> hashset = new HashSet<>(treeset);

        // Printing HashSet elements
        System.out.println("Printing HashSet elements: "+ hashset);
    }
}
/*
Output:
Printing TreeSet elements: [Harini, Krati, Shreya]
Printing HashSet elements: [Shreya, Harini, Krati]

Process finished with exit code 0

 */