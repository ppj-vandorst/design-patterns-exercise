package behavioral.observer;

public class OrderService implements InventoryObserver {
    @Override
    public void notify(String productName, int inventory) {
        if (inventory < 2) {
            System.out.printf("Inventory of %s has almost ran out, now ordering more!%n", productName);
        }
    }
}
