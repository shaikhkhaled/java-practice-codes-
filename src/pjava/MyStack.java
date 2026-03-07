package pjava;

import java.util.Stack;

public class MyStack {


    public static void main(String[] args) {
        Stack<Integer>list=new Stack<>();
        list.push(20);
        list.push(21);
        list.push(22);
        list.push(23);
        list.push(24);
        list.push(25);

        System.out.println(list.peek());
        list.pop();
        list.pop();
        System.out.println(list.peek());

    }
}
