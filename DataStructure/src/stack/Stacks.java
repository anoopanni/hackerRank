package stack;

import java.util.LinkedList;

public class Stacks {

    LinkedList stack;

    public Stacks(){
       stack  = new LinkedList();
    }

    public void push(int n){
        stack.addLast(n);
    }

    public int pop(){
        return (int)stack.removeLast();
    }

    public int peek(){
        return (int)stack.getLast();
    }

    public int size(){
        return stack.size();
    }

    public static void main(String[] args) {
        Stacks s = new Stacks();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
