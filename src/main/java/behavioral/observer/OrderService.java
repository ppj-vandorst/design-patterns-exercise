package behavioral.observer;

public class OrderService {

    // this method should be called when I get notified by the inventory service
    private void handleInventoryEvent(String productName, int inventory) {
        if (inventory < 2) {
            System.out.printf("Inventory of %s has almost ran out, now ordering more!%n", productName);
        }
    }
}
