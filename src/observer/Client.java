package observer;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(new String[]{"new products", "update prices"});
        Subscriber newProductSubscriber = new NewProductSubscriber();
        Subscriber priceUpdateSubscriber = new PriceUpdateSubscriber();

        store.eventManager.subscribe("new products", newProductSubscriber);
        store.eventManager.subscribe("update prices", priceUpdateSubscriber);

        store.addNewProducts(new String[]{"iPhone14", "MacBook M2"});
        store.updatePrices(new String[]{"MacBook M2", "Speakers"});

        store.eventManager.unsubscribe("new products", newProductSubscriber);

        store.addNewProducts(new String[]{"iWatch"});
    }


}
