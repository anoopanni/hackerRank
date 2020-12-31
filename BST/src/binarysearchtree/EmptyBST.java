package binarysearchtree;

public class EmptyBST<D extends Comparable> implements Tree<D>{
    public EmptyBST() {

    }

    public boolean isEmpty(){
        return false;
    }

    public int cardinality() {
        return 0;
    }

    public boolean member(D elt) {
        return false;
    }

    public NonEmptyBST<D> add(D elt){
        return new NonEmptyBST<D>(elt);
    }

    public int compareTo(D elt) {
        return 0;
    }
}
