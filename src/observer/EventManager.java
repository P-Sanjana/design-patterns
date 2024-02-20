package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<Subscriber>> subscribers = new HashMap<>();
    public EventManager(String[] events){
        for(String event: events){
            this.subscribers.put(event, new ArrayList<>());
        }
    }
    public void subscribe(String event, Subscriber subscriber){
        List<Subscriber> eventSubscribers = this.subscribers.get(event);
        eventSubscribers.add(subscriber);
    }

    public void unsubscribe(String event, Subscriber subscriber){
        List<Subscriber> eventSubscribers = this.subscribers.get(event);
        eventSubscribers.remove(subscriber);
    }

    public void notify(String event, String[] products){
        List<Subscriber> eventSubscribers = this.subscribers.get(event);
        for(Subscriber subscriber: eventSubscribers){
            subscriber.update(event, products);
        }
    }
}
