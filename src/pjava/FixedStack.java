package pjava;

import java.util.Stack;

public class FixedStack {
    private final int[]data;
    private int top;

    public FixedStack(int cap){
        this.data=new int[cap];
        this.top=0;
    }

    public void push(int value){
        data[top++]=value;
    }
    public int pop(){
        if (isEmpty() ){
            System.out.println("Stack is Under Flow");
        }
        return data[--top];
    }
    public int peek(){
        return data[top-1];
    }
    public boolean isEmpty(){
        return top==0;
    }

    public static void main(String[] args) {
//
//        FixedStack stack=new FixedStack(5);
//               stack.push(30);
//                stack.push(40);
//                stack.push(50);
//                stack.push(60);
//                stack.push(70);
//                stack.push(80);
//
//        System.out.println(stack.peek);
        Stack<Integer> list=new Stack<>();
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

