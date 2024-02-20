package observer;

import java.util.Arrays;

public class NewProductSubscriber implements Subscriber{

    public void update(String eventType, String[] newProducts) {
        System.out.println(eventType + " are added to the store: " + Arrays.toString(newProducts));
    }
}
