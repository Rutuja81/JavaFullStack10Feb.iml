package collectionframework;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.add(45);

        Collections.sort(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.empty());
//        System.out.println(stack.search(10));
        System.out.println(stack);
    }
}
