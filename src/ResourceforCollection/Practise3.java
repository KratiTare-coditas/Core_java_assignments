package Seventhweek.ResourceforCollection;
//HASHSET-duplicates are not allowed
import java.util.*;
public class Practise3 {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(32);
        set.add(54);
        set.add(21);
        set.add(56);
        System.out.println(set);
        set.add(54);
        System.out.println(set);
        set.remove(54);
        System.out.println(set);
        System.out.println(set.contains(44));
        System.out.println(set.size());
        System.out.println("============Linked Hashset==========");
        Set<Integer> set1=new LinkedHashSet<>();
        set1.add(7);
        set1.add(56);
        set1.add(3);
        set1.add(4);
        System.out.println(set1);
    }
}
