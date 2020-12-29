package ExceptionP;

public class ExceptionP {
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            int[] inArray = new int[10];
            System.out.println(inArray[6]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown "+ e);
        }
        finally {
            System.out.println("finished");
        }


    }

}
