package Seventhweek.ResourceforCollection;

import java.util.Stack;

public class Practise2 {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(45);
        stack.push(90);
        stack.push(135);
        stack.push(180);
        for(Integer element:stack)
        {
            System.out.println("The element is::"+element);
        }
        System.out.println(stack.pop());
    }
}
