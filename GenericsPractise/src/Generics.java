

public class Generics {
    public static <E> void printArray(E[] array){
         for(E element : array){
             System.out.print(element + " ");
         }
        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] intArray1;
        Integer[] intArray2 = new Integer[4];
        printArray(intArray2);
        Integer[] intArray3 = {5,2,9,1,3};
        printArray(intArray3);

        String[] shoppingList = {"bananas", "apples", "pears"};


    }

}
