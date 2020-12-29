package linkedlist;

/*
 * @author Anoop
 */

public class LinkedList {
    /*
     * @param args the command line arguments
     */
    Node head;
    int count;

//    public LinkedList()
//    {
//        this.head = null;
//        this.count = 0;
//     }

    public LinkedList(Node newHead) {
        head = newHead;
        this.count = 1;
    }

    //methods
    public void add(int newData){
        //create a newNode with newData
        Node newNode = new Node(newData);
        Node current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(newNode);
        count++;
    }

    //get
    public int get(int index){
        if (index <= 0){
            return -1;
        }
        Node current = head;
        for(int i=1; i<index; i++){
            current = current.getNext();
        }
        return current.getData();
    }


    public int size(){
        return this.count;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void remove(){
        // remove from the back of the list
        Node current = head;
        while(current.getNext() != null && current.getNext().getNext() != null){
            System.out.println(current.data);
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }




    public static void main(String[] args) {
        Node head = new Node(12);
        LinkedList l = new LinkedList(head);
        System.out.println(l.size());
        l.add(5);
        System.out.println(l.size());
        System.out.println(l.get(1));
        System.out.println(l.get(2));
        l.remove();
        System.out.println(l.size());
        l.remove();
        System.out.println(l.size());

    }


}
