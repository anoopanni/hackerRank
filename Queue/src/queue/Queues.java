package queue;

import java.util.LinkedList;


public class Queues {

    LinkedList queue;

    public Queues() {
        queue = new LinkedList();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

    public void enqueue(int n){
        queue.addLast(n);
    }

    public int dequeue(){
        return (int)queue.remove(0);
    }

    public int peek(){
        return (int)queue.get(0);
    }


    public static void main(String[] args) {
        Queues q = new Queues();
        q.enqueue(2);
        q.enqueue(10);
        q.enqueue(100);
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
