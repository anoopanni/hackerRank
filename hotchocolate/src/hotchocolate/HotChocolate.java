package hotchocolate;


import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoTemp) throws TooColdException,
            TooHotException {
        if (cocoTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoTemp <= tooCold) {
            throw new TooColdException();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic
        double currentCocoaTemp = 190;
        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("That coco was good");
                wrongTemp = false;
            } catch (TooHotException e1) {
                System.out.println("That is too hot " );
                System.out.println("Current temp:" + currentCocoaTemp);
                currentCocoaTemp -= 5;
            } catch (TooColdException e2) {
                System.out.println("That is soo cold ");
                System.out.println("Current temp:" + currentCocoaTemp);
                currentCocoaTemp += 5;
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("And its gone");

    }
}
