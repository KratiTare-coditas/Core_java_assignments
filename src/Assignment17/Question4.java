package Assignment17;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Question4 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("Naman");
        set.add("Yash");
        set.add("Rishi");
        set.add("Advait");
        Set<String> hashSetToTreeSet
                = new TreeSet<>(set);

        System.out.println("hashset elemnts::"+hashSetToTreeSet);
    }
}
/*
Output:
hashset elemnts::[Advait, Naman, Rishi, Yash]

Process finished with exit code 0

 */