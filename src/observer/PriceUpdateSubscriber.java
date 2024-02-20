package observer;

import java.util.Arrays;

public class PriceUpdateSubscriber implements Subscriber{

    public void update(String eventType, String[] updatedProducts) {
        System.out.println(eventType + " : " + Arrays.toString(updatedProducts));
    }
}
