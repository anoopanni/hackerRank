package binarysearchtree;

public class BST {
    public static void main(String[] args) throws Exception {
        NonEmptyBST d = new NonEmptyBST(2);
        System.out.println(d.add(4).member(5));
        System.out.println(d.member(4));
        System.out.println(d.cardinality());

        System.out.println("--------------------");

        EmptyBST e = new EmptyBST();
        NonEmptyBST n = new NonEmptyBST(6);
        Testers.checkIsEmpty(n);
//        Testers.checkIsEmpty(e);    uncommenting this will throw exception.


    }
}
