package observer;

public class Store {
    public EventManager eventManager;
     public Store(String[] events){
         eventManager = new EventManager(events);
     }

     public void addNewProducts(String[] newProducts){
         System.out.println("New products have been added to the store");
         eventManager.notify("new products", newProducts);
     }

     public void updatePrices(String[] updatePriceProducts){
         System.out.println("Price for products have been updated");
         eventManager.notify("update prices", updatePriceProducts);
     }
}
