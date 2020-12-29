package binarysearchtree;

public interface Tree <D extends Comparable> {
    public boolean isEmpty();
    public int cardinality(); //size of the tree
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}
