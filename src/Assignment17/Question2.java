package Assignment17;




import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

       /* for(int val:set)
        {
            first=val;
            break;
        }
        System.out.println(first);*/

       // int first ;
        System.out.println("First elemnt is::"+set.stream().findFirst().get());
        //System.out.println(first);
        Iterator<Integer> iterator = set.iterator();
       int last= 0;
        while(iterator.hasNext()){
            int element  = iterator.next();
            if(!iterator.hasNext()){
                last = element;
            }
        }
        System.out.println("Last element is::"+last);

    }


}

/*
Output:
First elemnt is::1
Last element is::5

Process finished with exit code 0

 */