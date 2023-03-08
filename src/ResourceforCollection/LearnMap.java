package Seventhweek.ResourceforCollection;

import javax.print.attribute.IntegerSyntax;
import java.util.HashMap;
import java.util.*;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> numbers=new HashMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.putIfAbsent("Three",3);
        //numbers.put("Two",4);
        System.out.println(numbers);
        for(Map.Entry<String,Integer>e:numbers.entrySet())
        {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}
