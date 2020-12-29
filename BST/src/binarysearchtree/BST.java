package binarysearchtree;

public class BST {
    public static void main(String[] args) {
        NonEmptyBST d = new NonEmptyBST(2);
        System.out.println(d.add(4).member(5));
        System.out.println(d.member(4));
        System.out.println(d.cardinality());
    }
}
