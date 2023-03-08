package Seventhweek.ResourceforCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Practise1 {
    public static void main(String[] args) {
        ArrayList<String> studentsName=new ArrayList<>();  //size-n ---- n+n/2+1
        studentsName.add("Sushmita");
        studentsName.add("Rutuja");
        studentsName.add("Diksha");
        System.out.println(studentsName);
        System.out.println("=============");
        for(String s:studentsName)
        {
            System.out.println("Names are:"+s);
        }
        System.out.println("=======================");
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(14);
        numbers.add(2);
        numbers.add(37);
        numbers.add(23);
        //arraylist prints in insertion order
        System.out.println(numbers);
        numbers.add(0,57);  //adding numbers at particular index
        System.out.println(numbers);
        System.out.println(numbers.get(2));
        numbers.remove(Integer.valueOf(2));
        System.out.println(numbers);  //tostring method gets invoked here
       for( int i=0;i<numbers.size();i++)
       {
           System.out.println("The element is::"+numbers.get(i));
       }
        System.out.println("======================");
       for(Integer element:numbers){
           System.out.println("The element is::"+element);
       }
        System.out.println("========================");
       Iterator<Integer>it=numbers.iterator();
       while(it.hasNext()){
           System.out.println("iterator:"+it.next());
       }

    }
}
